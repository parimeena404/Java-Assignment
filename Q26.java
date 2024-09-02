import java.util.Scanner;

public class Q26 {
    private static final int MAX = 1000;
    private int front, rear, size;
    private int[] queue;

    public Q26_QueueUsingArray() {
        queue = new int[MAX];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int item) {
        if (size >= MAX) {
            System.out.println("Queue overflow");
        } else {
            rear = (rear + 1) % MAX;
            queue[rear] = item;
            size++;
            System.out.println(item + " enqueued to queue");
        }
    }

    // Method to remove an element from the queue
    public void dequeue() {
        if (size <= 0) {
            System.out.println("Queue underflow");
        } else {
            System.out.println(queue[front] + " dequeued from queue");
            front = (front + 1) % MAX;
            size--;
        }
    }

    // Method to view the front element of the queue
    public void peek() {
        if (size <= 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element is " + queue[front]);
        }
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size <= 0;
    }

    public static void main(String[] args) {
        Q26_QueueUsingArray queue = new Q26_QueueUsingArray();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if empty");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number to enqueue: ");
                    int item = scanner.nextInt();
                    queue.enqueue(item);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Queue is not empty");
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
