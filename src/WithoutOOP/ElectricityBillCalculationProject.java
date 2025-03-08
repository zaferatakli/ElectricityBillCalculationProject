package task3.WithoutOOP;

import java.util.Scanner;

public class ElectricityBillCalculationProject {
    public static void main(String[] args) {
        /*Electricity Bill Calculation Project */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter New Consumption Value: ");
        int newConsumption = input.nextInt();
        System.out.print("Enter old Consumption Value: ");
        int firstConsumption = input.nextInt();
        int electricityConsumption = Math.abs(newConsumption - firstConsumption);
        float monthlyBill;
        if (electricityConsumption > 0 && electricityConsumption <= 100) {
            monthlyBill = (float) (electricityConsumption * 1.1);
        } else if (electricityConsumption >= 101 && electricityConsumption <= 200) {
            monthlyBill = (float) (electricityConsumption * 1.3);
        } else if (electricityConsumption >= 201 && electricityConsumption <= 300) {
            monthlyBill = (float) (electricityConsumption * 1.5);
        } else if (electricityConsumption >= 301 && electricityConsumption <= 400) {
            monthlyBill = (float) (electricityConsumption * 1.7);
        } else if (electricityConsumption >= 401 && electricityConsumption <= 500) {
            monthlyBill = (float) (electricityConsumption * 1.9);
        } else {
            monthlyBill = (float) (electricityConsumption * 2.3);
        }
        System.out.println("Electricity Consumption: " + electricityConsumption + "kWh" + " " + "\nYour Monthly Bill: " + monthlyBill + "TL");

    }
}
