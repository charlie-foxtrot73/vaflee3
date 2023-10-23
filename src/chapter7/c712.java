package chapter7;

import java.util.Scanner;
public class c712 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] qnum = new int[5];
        int index = 0;

        System.out.println("enter 5 unique numbers in range 10-100:");

        while (index < qnum.length) {
            System.out.print("enter a number: ");
            int num = scanner.nextInt();

            if (num >= 10 && num <= 100) {
                boolean duplicate = false;

                for (int i = 0; i < index; i++) {
                    if (num == qnum[i]) {
                        duplicate = true;
                        break;
                    }
                }

                if (!duplicate) {
                    qnum[index] = num;
                    index++;

                    System.out.print("unique numbers entered: ");
                    for (int i = 0; i < index; i++) {
                        System.out.print(qnum[i] + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("number is a duplicate; enter a unique number");
                }
            } else {
                System.out.println("enter a number in this range 10-100");
            }
        }

        scanner.close();
    }
}
