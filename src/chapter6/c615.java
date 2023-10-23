package chapter6;

import java.util.Scanner;
public class c615 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the sides of the triangles
        System.out.println("enter the sides of the triangles:");
        System.out.print("side 1 for triangle 1: ");
        double side1Triangle1 = scanner.nextDouble();
        System.out.print("side 2 for triangle 1: ");
        double side2Triangle1 = scanner.nextDouble();
        System.out.print("side 1 for triangle 2: ");
        double side1Triangle2 = scanner.nextDouble();
        System.out.print("side 2 for triangle 2: ");
        double side2Triangle2 = scanner.nextDouble();
        System.out.print("side 1 for triangle 3: ");
        double side1Triangle3 = scanner.nextDouble();
        System.out.print("side 2 for triangle 3: ");
        double side2Triangle3 = scanner.nextDouble();

        // вычисл и отображение результатов
        double hypotenuse1 = hypotenuse(side1Triangle1, side2Triangle1);
        double hypotenuse2 = hypotenuse(side1Triangle2, side2Triangle2);
        double hypotenuse3 = hypotenuse(side1Triangle3, side2Triangle3);

        System.out.printf("hypotenuse for triangle 1: %.2f%n", hypotenuse1);
        System.out.printf("hypotenuse for triangle 2: %.2f%n", hypotenuse2);
        System.out.printf("hypotenuse for triangle 3: %.2f%n", hypotenuse3);

        scanner.close();
    }

    // вычисл гипотенузы методом теоремы пифагора?
    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
