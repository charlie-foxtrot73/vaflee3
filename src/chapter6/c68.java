package chapter6;

import java.util.Scanner;
public class c68 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalReceipts = 0.0;

        System.out.println("parking garage charges");
        System.out.println("enter the hours parked for each customer");
        System.out.println("maximum charge for a 24-hour period is $10.00");

        while (true) {
            System.out.print("enter the hours parked (or -1 to exit): ");
            double hoursParked = scanner.nextDouble();

            if (hoursParked == -1) {
                break;
            }

            double charge = calculateCharges(hoursParked);
            System.out.printf("parking charge: $%.2f%n", charge);

            totalReceipts += charge;
        }

        System.out.printf("total receipts for yesterday: $%.2f%n", totalReceipts);

        scanner.close();
    }

    public static double calculateCharges(double hoursParked) {
        double minFee = 2.0;
        double hourlyRate = 0.5;
        double maxCharge = 10.0;

        if (hoursParked <= 3.0) {
            return minFee;
        } else if (hoursParked <= 24.0) {
            double additionalHours = hoursParked - 3.0;
            double additionalCharges = Math.ceil(additionalHours) * hourlyRate;
            double totalCharge = minFee + additionalCharges;
            return (totalCharge > maxCharge) ? maxCharge : totalCharge;
        } else {
            return maxCharge;
        }
    }
}
