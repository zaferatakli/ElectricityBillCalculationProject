package task3;

import java.util.Scanner;

public class ElectricityBillCalculationProject01Task03 {
    public static void main(String[] args) {
        /*Elektrik Faturası Hesaplama Projesi */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter New Consumption Value: ");
        int yeniTuketim = input.nextInt();
        System.out.print("Enter old Consumption Value: ");
        int ilkTuketim = input.nextInt();
        int elektrikTuketimi = Math.abs(yeniTuketim - ilkTuketim);
        float aylikFatura;
        if (elektrikTuketimi >0 && elektrikTuketimi<=100) {
            aylikFatura=(float)(elektrikTuketimi*1.1);
        } else if (elektrikTuketimi>=101 && elektrikTuketimi<=200) {
            aylikFatura=(float)(elektrikTuketimi*1.3);
        } else if (elektrikTuketimi>=201 && elektrikTuketimi<=300) {
            aylikFatura=(float)(elektrikTuketimi*1.5);
        } else if (elektrikTuketimi>=301 && elektrikTuketimi<=400) {
            aylikFatura=(float)(elektrikTuketimi*1.7);
        } else if (elektrikTuketimi>=401 && elektrikTuketimi<=500) {
            aylikFatura=(float)(elektrikTuketimi*1.9);
        } else {
            aylikFatura=(float)(elektrikTuketimi*2.3);
        }
        System.out.println("Bu ayki Elektrik Tuketiminiz: "+elektrikTuketimi+"kWh"+
                " "+"Faturaniz: " + aylikFatura + "TL");

    }
}
