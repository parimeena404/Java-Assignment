import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose conversion type:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter binary number: ");
            String binaryString = scanner.next();
            int decimal = binaryToDecimal(binaryString);
            System.out.println("Binary " + binaryString + " in decimal is: " + decimal);
        } else if (choice == 2) {
            System.out.print("Enter decimal number: ");
            int decimal = scanner.nextInt();
            String binaryString = decimalToBinary(decimal);
            System.out.println("Decimal " + decimal + " in binary is: " + binaryString);
        } else {
            System.out.println("Invalid choice");
        }
    }

    // Method to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    // Method to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}
