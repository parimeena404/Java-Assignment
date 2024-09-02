public class Q31 {

    // Class member variable
    private String message;

    // Zero-argument constructor
    public Q31_ZeroArgumentsConstructor() {
        message = "Hello from the zero-argument constructor!";
    }

    // Method to display the message
    public void displayMessage() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        // Creating an instance of the class using the zero-argument constructor
        Q31_ZeroArgumentsConstructor obj = new Q31_ZeroArgumentsConstructor();
        obj.displayMessage(); // Display the message
    }
}
