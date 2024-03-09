package classwork.lesson13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Գրեք թիվ");
        int num = sc.nextInt();
        System.out.println("Դւք ընտրել եք " + num);
    }
}
