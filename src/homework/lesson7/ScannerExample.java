package homework.lesson7;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Գրեք թիվ գումարման համար");
        int num = sc.nextInt();
        System.out.println("Գրեք երկրորդ թիվը ");
        int num2 = sc.nextInt();
        System.out.println(num + num2);
        System.out.println("Գրեք թիվ հանման համար");
        int num3 = sc.nextInt();
        System.out.println("Գրեք երկրորդ թիվը");
        int num4 = sc.nextInt();
        System.out.println(num3 - num4);
        System.out.println("Գրեք թիվ բաժանման համար");
        int num5 = sc.nextInt();
        System.out.println("Գրեք երկրորդ թիվը ");
        int num6 = sc.nextInt();
        System.out.println(num5 / num6);
        System.out.println("Գրեք թիվ բազմապատկման համար");
        int num7 = sc.nextInt();
        System.out.println("Գրեք երկրորդ թիվը ");
        int num8 = sc.nextInt();
        System.out.println(num7 * num8);
    }
}

