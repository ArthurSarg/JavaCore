package homework.lesson4;


public class MethodExample {
    public static void main(String[] args) {
        Method(12);

    }

    static void Method(int num) {
        if ((num % 2) == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}
