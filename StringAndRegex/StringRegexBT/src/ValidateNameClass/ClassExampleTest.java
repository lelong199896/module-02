package ValidateNameClass;

import java.util.Scanner;

public class ClassExampleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name class: ");
        String nameClass = scanner.nextLine();

        ClassExample classExample = new ClassExample();
        boolean isValid = classExample.validate(nameClass);
        System.out.println("Class name " + nameClass + " is valid: " + isValid);
    }
}
