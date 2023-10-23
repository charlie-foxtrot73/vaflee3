package chapter7;

public class c714 {

    public static void main(String[] args) {
        System.out.println("product of ints (no arguments): " + product());
        System.out.println("product of ints (1 argument): " + product(5));
        System.out.println("product of ints (3 arguments): " + product(2, 3, 4));
        System.out.println("product of ints (5 arguments): " + product(1, 2, 3, 4, 5));
    }

    public static int product(int... numbers) {
        int result = 1;

        for (int num : numbers) {
            result *= num;
        }

        return result;
    }
}