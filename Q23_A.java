public class Q23_A {
    public static void main(String[] args) {
        int rows = 3; // Number of rows
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(number + " ");
                number++;
            }

            System.out.println();
        }
    }
}
