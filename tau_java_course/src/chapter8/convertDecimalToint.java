package chapter8;

//convert the decimal numbers into a whole numbers.

public class convertDecimalToint {
    public static void main(String[] args) {
        double[] numbers = {1.5, 3.98, 45.6, 222.7};

        for (double number : numbers) {
            System.out.println((int) number);
        }
    }
}
