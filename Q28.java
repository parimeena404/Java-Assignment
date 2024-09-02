import java.util.Scanner;

public class Q28{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of elements.");
            return;
        }

        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = sumOfOddNumbers(numbers);

        System.out.println("The sum of all odd numbers in the array is: " + sum);
    }

    // Method to find the sum of all odd numbers in an array
    public static int sumOfOddNumbers(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 != 0) { // Check if the number is odd
                sum += num;
            }
        }
        return sum;
    }
}
