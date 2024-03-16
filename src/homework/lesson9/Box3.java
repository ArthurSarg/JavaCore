package homework.lesson9;

public class Box3 {
    public static void main(String[] args) {
        class BoxDemo3 {
            public static void main(String[] args) {
                Box myBox = new Box();
                double vol;
                myBox.width = 10;
                myBox.height = 20;
                myBox.depth = 15;
                vol = myBox.width * myBox.height * myBox.depth;
                System.out.println("* " +  vol);

            }

        }
    }
}
