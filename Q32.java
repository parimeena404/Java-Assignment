public class Q32 {

    // Class member variables
    private String name;
    private int age;

    // Parameterized constructor
    public Q32_ParameterizedConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the values
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an instance of the class using the parameterized constructor
        Q32_ParameterizedConstructor obj = new Q32_ParameterizedConstructor("Pari", 19);
        obj.displayInfo(); // Display the values
    }
}
