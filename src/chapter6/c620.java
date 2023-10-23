package chapter6;

import java.util.Scanner;
public class c620 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the r of the circle: ");
        double radius = scanner.nextDouble();

        if (radius >= 0) {
            double area = circleArea(radius);
            System.out.printf("the area of the circle with radius %.2f is %.2f%n", radius, area);
        } else {
            System.out.println("invalid");
        }

        scanner.close();
    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
