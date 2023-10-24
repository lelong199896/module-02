package ConvertDecimalToBinary;

import java.util.Scanner;

public class BinaryToDicimal {
        public static int binaryToDecimal(int num)
        {
            int decimalNumber = 0;
            int i = 0;
            int remainder;
            while (num != 0)
            {
                remainder = num % 10;
                num /= 10;
                decimalNumber += remainder * Math.pow(2, i);
                ++i;
            }
            System.out.print("Dicimal representation is: " + decimalNumber);
            return decimalNumber;
    }
}
