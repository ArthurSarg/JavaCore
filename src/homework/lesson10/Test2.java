package homework.lesson10;

public class Test2 {
    int a,b;
    Test2(int i, int j) {
        a = i;
        b = j;

    }
    boolean equalTo(Test2 o) {
        if (o.a == a && o.b ==b) return true;
        else return false;
    }

    public static class PassOb {
        public static void main(String[] args) {
            Test ob1 = new Test();
            Test ob2 = new Test();
            Test ob3 = new Test();
            System.out.println("ob == ob2: " + ob1.equals(ob2));
            System.out.println("ob == ob3: " + ob1.equals(ob3));
        }
    }
}
