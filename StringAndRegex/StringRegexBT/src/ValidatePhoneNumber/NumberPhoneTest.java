package ValidatePhoneNumber;

import java.util.Scanner;

public class NumberPhoneTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number phone: ");
        String phone = scanner.nextLine();

        NumberPhone numberPhone = new NumberPhone();
        boolean isValid = numberPhone.validate(phone);
        System.out.println("Number phone " + phone + " is valid: " + isValid);
    }
}
