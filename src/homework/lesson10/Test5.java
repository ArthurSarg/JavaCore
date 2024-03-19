package homework.lesson10;

public class Test5 {
    int a;

    Test5(int i) {
        a = i;
    }

    Test incrByTen() {
        Test temp = new Test();
        return temp;

    }


    public static class RetOb {
        public static void main(String[] args) {
            Test ob1 = new Test();

            System.out.println("ob1.a: ");
            System.out.println("ob2.a: ");

            System.out.println("ob2.a արժեքի երկրորդ աճից հետո: ");

        }
    }
}
