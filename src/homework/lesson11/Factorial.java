package homework.lesson11;

public class Factorial {
    int fact(int n) {
        int result;
        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }

        public static class Recursion {
            public static void main(String[] args) {
                Factorial f=new Factorial();
                System.out.println("ֆակտորիալ 3-ը հավասար է " + f.fact(3));
                System.out.println("ֆակտորիալ 4-ը հավասար է " + f.fact(4));
                System.out.println("ֆակտորիալ 5-ը հավասար է " + f.fact(5));
            }
        }

}
