package classwork.lesson18;


class UseStatic {
    static int a = 3;
    static int b;
    static void meth (int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static {
        System.out.println("Ստատիկ բլոկը սկզբնավորվել է։");
         b = a * 4;

    }

    public static void main(String[] args) {
        meth(42);
    }
}
