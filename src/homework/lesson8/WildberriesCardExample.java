package homework.lesson8;

import java.util.Scanner;

public class WildberriesCardExample {
    static int num;
    static int num2;
    static int num3;
    static int num4;

    public static void main(String[] args) {
        volume();
    }

    static void volume() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Բարև, Wildberries-ին քարտ ավելացնելու համար ձեզ պետք է գրել քարտ-ի թվերը");
        System.out.println("Գրեք I 4 թվերը");
        num = sc.nextInt();
        System.out.println("Գրեք II 4 թիվը");
        num2 = sc.nextInt();
        System.out.println("Գրեք III 4 թիվը");
        num3 = sc.nextInt();
        System.out.println("Գրեք IV 4 թիվը");
        num4 = sc.nextInt();

        System.out.println("Ձեր քարտի թվերն են " + num + " " + num2 + " " + num3 + " " + num4 + "?");
        System.out.println("Դուք հաստատում եք ?");
        System.out.println("Այո-1,Ոչ-2");
        int ayo = sc.nextInt ();
        if (ayo == 1) {
            System.out.println("Ձեր քարտը ավելացվել է");
        }
        if (ayo == 2) {
            System.out.println("Փորցեք նորից");
        }



    }
}
