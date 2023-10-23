package chapter7;

public class c715 {

    public static void main(String[] args) {
        int arraySize;

        if (args.length > 0) {
            try {
                arraySize = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("invalid input. using the default array size of 10");
                arraySize = 10;
            }
        } else {
            arraySize = 10;
        }

        int[] array = new int[arraySize];

        System.out.printf("%s%8s%n", "Index", "Value"); // column headings

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d%8d%n", i, array[i]);
        }
    }
}