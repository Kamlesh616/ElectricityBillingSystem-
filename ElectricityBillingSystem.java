import java.util.Scanner;

class User {
    private String name;
    private String address;
    private int meterId;
    
    public User(String name, String address, int meterId) {
        this.name = name;
        this.address = address;
        this.meterId = meterId;
    }

    public String getName() {
        return name;
    }
    
    // Other getters and setters (omitted for brevity)
}

class Bill {
    private User user;
    private int unitsConsumed;
    private double billAmount;
    
    public Bill(User user, int unitsConsumed) {
        this.user = user;
        this.unitsConsumed = unitsConsumed;
    }

    public void calculateBill() {
        // Billing calculation logic here (as mentioned earlier)
        billAmount = unitsConsumed * 0.10;
    }

    public double getBillAmount() {
        return billAmount;
    }

    // Other getters and setters (omitted for brevity)
}

public class ElectricityBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample user data
        User user1 = new User("John Doe", "123 Main St", 1001);
        User user2 = new User("Jane Smith", "456 Park Ave", 1002);

        // Input meter readings (units consumed) from users
        System.out.print("Enter units consumed for " + user1.getName() + ": ");
        int unitsUser1 = scanner.nextInt();
        System.out.print("Enter units consumed for " + user2.getName() + ": ");
        int unitsUser2 = scanner.nextInt();

        // Calculate bills
        Bill billUser1 = new Bill(user1, unitsUser1);
        billUser1.calculateBill();
        Bill billUser2 = new Bill(user2, unitsUser2);
        billUser2.calculateBill();

        // Display bills
        System.out.println("\nBill for " + user1.getName() + ": $" + billUser1.getBillAmount());
        System.out.println("Bill for " + user2.getName() + ": $" + billUser2.getBillAmount());

        scanner.close();
    }
}
