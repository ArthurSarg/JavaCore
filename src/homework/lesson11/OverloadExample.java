package homework.lesson11;

public class OverloadExample {
    public static void main(String[] args) {
        OverloadExample overloadExample = new OverloadExample();
        long b = 6;
        overloadExample.method(b);
    }
        void method (long i) {
            System.out.println("long");
        }
        void method (byte i) {
            System.out.println("byte");
        }
    void method (int i) {
        System.out.println("long");
    }
    void method (short i) {
        System.out.println("byte");
    }
    void method (float i) {
        System.out.println("long");
    }
    void method (double i) {
        System.out.println("byte");
    }



    }


