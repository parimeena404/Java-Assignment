import java.util.Scanner;

public class Q25 {
    private static final int MAX = 1000;
    private int top;
    private int[] stack = new int[MAX];

    public Q25_StackUsingArray() {
        top = -1;
    }

    // Method to push an element onto the stack
    public void push(int item) {
        if (top >= MAX - 1) {
            System.out.println("Stack overflow");
        } else {
            stack[++top] = item;
            System.out.println(item + " pushed to stack");
        }
    }

    // Method to pop an element from the stack
    public void pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
        } else {
            System.out.println(stack[top--] + " popped from stack");
        }
    }

    // Method to view the top element of the stack
    public void peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is " + stack[top]);
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top < 0;
    }

    public static void main(String[] args) {
        Q25_StackUsingArray stack = new Q25_StackUsingArray();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if empty");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number to push: ");
                    int item = scanner.nextInt();
                    stack.push(item);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
