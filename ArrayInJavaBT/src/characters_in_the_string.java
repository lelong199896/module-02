import java.util.Scanner;

public class characters_in_the_string {
    public static void main(String[] args) {
        String stringInput;
        char characters;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        stringInput = scanner.nextLine();
        System.out.print("Enter characters: ");
        characters = scanner.next().charAt(0);
        for (int i = 0; i < stringInput.length(); i++) {
            if (characters == stringInput.charAt(i)) {
                count++;
            }
        }
        System.out.println("Kí tự " + characters + " xuất hiện: " + count + " lần");
    }
}
