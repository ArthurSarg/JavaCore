package homework.lesson2;

public class ForHomeworkExample {
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            for (int j = 14; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


