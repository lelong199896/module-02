package NextDayCalculator;

import java.util.Scanner;

public class NextDayCalculator {
    public static void main(String[] args) {
        int day;
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Month: ");
        month = scanner.nextInt();
        switch(month) {
            case 2:
                System.out.print("Enter Day: ");
                day = scanner.nextInt();
                if (day < 28) {
                    day += 1;
                    System.out.println("Next day: " + day + "/" + month);
                } else if (day == 28) {
                    day = 1;
                    month += 1;
                    System.out.println("Next day: " + day + "/" + month);
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("Enter Day: ");
                day = scanner.nextInt();
                if (day < 30) {
                    day += 1;
                    System.out.println("Next day: " + day + "/" + month);
                } else if (day == 30) {
                    day = 1;
                    month += 1;
                    System.out.println("Next day: " + day + "/" + month);
                }
                break;
            default:
                System.out.print("Enter Day: ");
                day = scanner.nextInt();
                if (day < 31) {
                    day += 1;
                    System.out.println("Next day: " + day + "/" + month);
                } else if (day == 31) {
                    day = 1;
                    month += 1;
                    System.out.println("Next day: " + day + "/" + month);
                }
                break;
        }
    }
}
