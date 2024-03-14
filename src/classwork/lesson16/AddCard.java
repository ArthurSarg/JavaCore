package classwork.lesson16;

import java.util.Scanner;

public class AddCard {
    public static void main(String[] args) {
//Այս կոդի օգնությամբ մենք կարողանում ենք scanner-ով աշխատել (Scanner sc = new Scanner(System.in);)
        Scanner sc = new Scanner(System.in);
        Grancum();
        //Այս կոդի օգնությամբ մենք կարող ենք հաստատել մեր քարտի ավելացումը
            System.out.println("Հաստատում ե՞ք");
            System.out.println("Այո-1, Ոչ-2");
            int patasxan = sc.nextInt();
            if (patasxan == 1) {
                System.out.println("Դուք գրանցվել եք");
            }
            if (patasxan == 2) {
                System.out.println("Փորցեք նորից");
                Grancum();
                System.out.println("Դուք գրանցվալ եք");
            }


        }

        static void Grancum () {

            Scanner sc = new Scanner(System.in);
            //Այս կոդի օգնությամբ մենք ավելացնում ենք մեր քարտի առաջին 4 թվերը
            System.out.println("Ավելացրեք ձեր քարտը");
            System.out.println("Գրեք ձեր քարտի առաջին 4 թվերը");
            String tiv1 = sc.nextLine();
            if ((tiv1.length() != 4)) {
                System.out.println("Սխալ է");

            }
            //Այս կոդի օգնությամբ մենք ավելացնում ենք մեր քարտի երկրորդ 4 թվերը
            System.out.println("Գրեք ձեր քարտի երկրորդ 4 թվերը");
            String tiv2 = sc.nextLine();
            if ((tiv2.length() != 4)) {
                System.out.println("Սխալ է");

            }
            //Այս կոդի օգնությամբ մենք ավելացնում ենք մեր քարտի երրորդ 4 թվերը
            System.out.println("Գրեք ձեր քարտի երրորդ 4 թվերը");
            String tiv3 = sc.nextLine();
            if ((tiv3.length() != 4)) {
                System.out.println("Սխալ է");

            }
            //Այս կոդի օգնությամբ մենք ավելացնում ենք մեր քարտի չորրորդ 4 թվերը
            System.out.println("Գրեք ձեր քարտի չորրորդ 4 թվերը");
            String tiv4 = sc.nextLine();
            if ((tiv4.length() != 4)) {
                System.out.println("Սխալ է");

            }
        }
    }





