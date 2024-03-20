package homework.lesson11;

public class Test {
    int a;
    public int b;
    private int c;
    int getc() {
        return c;
    }

    }
     class AccessTest {
         public static void main(String[] args) {
             Test ob = new Test();
             ob.a = 10;
             ob.b = 20;
             ob.getc();
             System.out.println("a,b, և c: " + ob.a + " " + ob.b + " " + ob.getc());
         }
    }

