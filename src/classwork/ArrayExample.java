package classwork;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 2 + random.nextInt(4);
            System.out.println(numbers[i]);
        }
    }
}