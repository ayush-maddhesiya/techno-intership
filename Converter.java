import java.util.Scanner;

public class BinaryToDecimalConverter{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryStr = input.nextLine();

        // Check if the input is a valid binary number
        if (isBinary(binaryStr)) {
            int decimal = binaryToDecimal(binaryStr);
            System.out.println("Decimal equivalent: " + decimal);
        } else {
            System.out.println("Invalid binary number input.");
        }
    }

    // Function to check if the input is a valid binary number
    public static boolean isBinary(String binary) {
        for (char c : binary.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }

    // Function to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, length - 1 - i);
            }
        }
        return decimal;
    }
}
