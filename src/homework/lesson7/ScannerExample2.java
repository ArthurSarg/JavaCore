package homework.lesson7;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Գրեք թիվ");
        int num = sc.nextInt();
        System.out.println("Գրեք երկրորդ թիվը");
        int num2 = sc.nextInt();
        System.out.println("Գումարում");
        System.out.println(num + num2);
        System.out.println("Հանում");
        System.out.println(num - num2);
        System.out.println("Բաժանում");
        System.out.println(num / num2);
        System.out.println("Բազմապատքում");
        System.out.println(num * num2);
    }
}
