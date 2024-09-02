public class Q23_B {
    public static void main(String[] args) {
        int rows = 4; // Number of rows

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int k = i; k > 1; k--) {
                System.out.print(k + " ");
            }

            // Print increasing numbers
            for (int l = 1; l <= i; l++) {
                System.out.print(l + " ");
            }

            System.out.println();
        }
    }
}
