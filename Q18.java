import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0;
        int temp = Math.abs(number); // Handle negative numbers by taking absolute value

        if (temp == 0) {
            count = 1; // The number 0 has 1 digit
        } else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }

        System.out.println("The number of digits in " + number + " is: " + count);
    }
}
