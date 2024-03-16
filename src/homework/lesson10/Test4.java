package homework.lesson10;

public class Test4 {
    int a,b;
    Test4(int i, int j) {
        a = i;
        b = j;

    }
    void meth(Test4 o) {
        o.a *= 2;
        o.b /= 2;
    }

    public static class PassObjRe {
        public static void main(String[] args) {
            Test ob = new Test();
            System.out.println("ob.a և ob.b կանչից առաջ։ " + ob + " " + ob);

            System.out.println("ob.a և ob.b կանչից հետո։ " + ob + " " + ob);

        }
    }
}
