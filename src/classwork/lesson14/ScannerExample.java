package classwork.lesson14;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grancum();
        System.out.println("Հաստատում ե՞ք");
        System.out.println("Այո-1, Ոչ-2");
        int patasxan = sc.nextInt();
        if (patasxan == 1) {
            System.out.println("Դուք գրանցվալ եք");
        }
        if (patasxan == 2) {
            System.out.println("Փորցեք նորից");
            Grancum();
            System.out.println("Դուք գրանցվալ եք");
        }


    }

    static void Grancum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Գրեք ձեր անունը");
        String name = sc.nextLine();
        System.out.println("Գրեք ձեր ազգանունը");
        String surname = sc.nextLine();
        System.out.println("Գրեք ձեր հայրանունը");
        String fathername = sc.nextLine();
        System.out.println("Գրեք ձեր հեռախոսահամարը");
        int num = sc.nextInt();
    }
}