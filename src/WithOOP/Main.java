package task3.WithOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter New Consumption Value: ");
        int newConsumption = input.nextInt();
        System.out.print("Enter Old Consumption Value: ");
        int oldConsumption = input.nextInt();

        // Creating an object of ElectricityBill class
        ElectricityBill bill = new ElectricityBill(oldConsumption, newConsumption);

        // Displaying bill details
        bill.displayBill();

        input.close();
    }
}
