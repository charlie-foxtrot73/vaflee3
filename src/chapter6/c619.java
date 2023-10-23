package chapter6;

import java.util.Scanner;
public class c619 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the side length for the square: ");
        int side = scanner.nextInt();

        System.out.print("enter the character to fill the square with: ");
        char fillCharacter = scanner.next().charAt(0);

        if (side > 0) {
            squareOfCharacters(side, fillCharacter);
        } else {
            System.out.println("enter a positive integer for the side length");
        }

        scanner.close();
    }

    public static void squareOfCharacters(int side, char fillCharacter) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }
}