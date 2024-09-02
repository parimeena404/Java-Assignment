import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            System.out.print("Marks in Mathematics: ");
            int mathMarks = scanner.nextInt();
            
            System.out.print("Marks in Physics: ");
            int physicsMarks = scanner.nextInt();
            
            System.out.print("Marks in Chemistry: ");
            int chemistryMarks = scanner.nextInt();
            
            int totalMarks = mathMarks + physicsMarks + chemistryMarks;
            int mathPhysicsTotal = mathMarks + physicsMarks;

            if ((mathMarks >= 60 && physicsMarks >= 50 && chemistryMarks >= 40 && totalMarks >= 200) ||
                (mathPhysicsTotal >= 150)) {
                System.out.println("Student " + (i + 1) + " is eligible for admission.");
            } else {
                System.out.println("Student " + (i + 1) + " is not eligible for admission.");
            }
        }
    }
}
