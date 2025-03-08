package task3.WithOOP;

public class ElectricityBill {
    private final int oldConsumption;
    private final int newConsumption;

    // Constructor
    public ElectricityBill(int oldConsumption, int newConsumption) {
        this.oldConsumption = oldConsumption;
        this.newConsumption = newConsumption;
    }

    // Method to calculate electricity consumption
    public int calculateConsumption() {
        return Math.abs(newConsumption - oldConsumption);
    }

    // Method to calculate bill based on consumption
    public float calculateBill() {
        int electricityConsumption = calculateConsumption();
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
        return monthlyBill;
    }

    // Method to display bill details
    public void displayBill() {
        System.out.println("Electricity Consumption: " + calculateConsumption() + " kWh");
        System.out.println("Your Monthly Bill: " + calculateBill() + " TL");
    }

}
