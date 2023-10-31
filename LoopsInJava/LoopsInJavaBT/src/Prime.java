import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        //Hiển thị 20 SNT đầu tiên
        int number;
        int count = 0;
        int countSNT = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố muốn hiển thị: ");
        number = input.nextInt();
        for (int i = 2; i < 1000; i++) {
            if (countSNT < number) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(i);
                    countSNT++;
                }
                count = 0;
            }
        }
    }
}
