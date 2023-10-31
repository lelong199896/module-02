import java.util.Scanner;

public class IntroJava {
    public static void main(String[] args) {
        //Hiển thị lời chào
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);

        //Chuyển đổi tiền tệ
        double VND = 23000;
        double USD;
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Nhập số USD: ");
        USD = scanner1.nextDouble();
        double quydoi = USD * VND;
        System.out.print("Giá trị VND: " + quydoi);

        //Đọc số thành chữ
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        String num = scanner2.nextLine();
        int numLength = num.length();
         String result = "";
         String[] number = {"", "one", "two", "three", "four", "five", "six", "seven",
         "eight", "nine", "ten",
         "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
         "seventeen", "eighteen",
         "nineteen"};
         String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty",
         "seventy", "eighty", "ninety"};
         String[] unit = {"", "", "hundred", "thousand"};

         for (int i = numLength; i > 0; i--) {
         int x = Integer.parseInt(String.valueOf(num.charAt(numLength - i)));
             if (i == 2) {
                if (x == 1) {
                    result += number[Integer.parseInt(num.substring(numLength - 2))];
                break;
                 } else {
                    result += tens[x] + " ";
                 }
             } else {
                result += number[x] + " " + unit[i - 1] + " ";
             }
         }
         System.out.println(result);

    }
}
