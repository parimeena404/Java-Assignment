import java.util.Scanner;

// Commission class
class Commission {
    private double sales;

    public Commission(double sales) {
        this.sales = sales;
    }

    public double commission() {
        // Assuming a commission rate of 10% for this example
        final double COMMISSION_RATE = 0.10;
        return sales * COMMISSION_RATE;
    }
}

// Demo class
public class Q33_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sales amount: ");
        double sales = scanner.nextDouble();

        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            // Create a Commission object with the valid sales amount
            Commission commission = new Commission(sales);

            // Get and print the commission
            double commissionAmount = commission.commission();
            System.out.println("The commission is: $" + commissionAmount);
        }
    }
}