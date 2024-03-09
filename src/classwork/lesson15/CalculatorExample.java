package classwork.lesson15;

import java.util.Scanner;

public class CalculatorExample {
    static int num;
    static int num2;
    static int num3;
    static int num4;

    public static void main(String[] args) {
        Grancum();
        volume();
    }

    static void volume() {
        System.out.println(num + " + " + num2 + " + " + num3 + " + " +num4 + " = "+(num + num2 + num3 + num4));
    }

    static void Grancum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Գրեք I թիվը");
        num = sc.nextInt();
        System.out.println("Գրեք II թիվը");
        num2 = sc.nextInt();
        System.out.println("Գրեք III թիվը");
        num3 = sc.nextInt();
        System.out.println("Գրեք IV թիվը");
        num4 = sc.nextInt();
    }
}
