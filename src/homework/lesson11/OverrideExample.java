package homework.lesson11;


public class OverrideExample {
    public static void main(String[] args) {
        Parents parents = new Parents();
        Parents child = new Child();
        System.out.println(parents.method());
        System.out.println(child.method());
    }

    static class Child extends Parents{
        @Override
        int method(){
            return 2;
        }
    }

    static class Parents {
        static int method() {
            return 1;
        }
    }
}
