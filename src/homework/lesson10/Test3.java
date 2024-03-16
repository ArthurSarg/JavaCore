package homework.lesson10;

public class Test3 {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    public static class CallByValue {
        public static void main(String[] args) {
            Test ob = new Test();
            int a = 15, b = 20;
            System.out.println("a և b կանչից առաջ։ " + a + " " + b);

            System.out.println("a և b կանչից առաջ։ " + a + " " + b);
        }
    }


}
