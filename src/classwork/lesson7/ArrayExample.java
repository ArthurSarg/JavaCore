package classwork.lesson7;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = { 98, -87, 96, -88};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
            for (int j = 1; j > i  ; j--) {
                System.out.println("Hello, your location is");

            }
        }
    }

}

