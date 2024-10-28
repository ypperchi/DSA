import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CustomerServiceQueue {

    public static void main(String[] args) {
        Queue<Integer> customerQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---Customer Service Queue---");
            System.out.println("1. Add Customer");
            System.out.println("2. Remove Customer");
            System.out.println("3. View Next Customer");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer ID: ");
                    int customerId = scanner.nextInt();
                    customerQueue.offer(customerId);
                    System.out.println("Customer added to the queue.");
                    break;
                case 2:
                    if (!customerQueue.isEmpty()) {
                        int nextCustomer = customerQueue.poll();
                        System.out.println("Next Customer ID: " + nextCustomer);
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 3:
                    if (!customerQueue.isEmpty()) {
                        int nextCustomer = customerQueue.peek();
                        System.out.println("Next Customer ID: " + nextCustomer);
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }
}
