package classwork.lesson16;

import java.util.Scanner;


public class AddCard {
    public static void main(String[] args) {
//Այս կոդի օգնությամբ մենք կարողանում ենք scanner-ով աշխատել (Scanner sc = new Scanner(System.in);)
        Scanner sc = new Scanner(System.in);
        //Այս կոդի օգնությամբ մենք կարող ենք հաստատել մեր քարտի ավելացումը
        Grancum();
        System.out.println("Հաստատում ե՞ք");
        System.out.println("Այո-1, Ոչ-2");
        int patasxan = sc.nextInt();
        if (patasxan == 1) {
            System.out.println("Դուք գրանցվել եք");
        }
        if (patasxan == 2) {
            System.out.println("Փորցեք նորից");
            Grancum();
            System.out.println("Դուք գրանցվել եք");
        }
        if ((patasxan) != 1) {
            System.out.println("Սխալ է");
        }
        if ((patasxan) != 2) {
            System.out.println();
        }


    }

    static void Grancum() {

        Scanner sc = new Scanner(System.in);
        //Այս կոդի օգնությամբ մենք ավելացնում ենք մեր քարտի առաջին 4 թվերը
        System.out.println("Ավելացրեք ձեր քարտը");
        System.out.println("Գրեք ձեր քարտի թվերը");
        String tiv1 = sc.nextLine();
        if ((tiv1.length() != 16)) {
            System.out.println("Սխալ է");
            System.out.println("Փորցեք նորից");
            Grancum();
        }

    }
}





