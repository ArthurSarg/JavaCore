package homework.lesson9;

public class Box {
    double width;
    double height;
    double depth;
    public double volume() {
        return width * height * depth;
    }
    public void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }

    public static class BoxDemo {
        public static void main(String[] args) {
            Box myboxl = new Box();
            Box mybox2 = new Box();
            double vol;
            myboxl.setDim(7, 11, 18);
            mybox2.setDim(4, 9, 13);
            vol = myboxl.volume();
            System.out.println("Ծավալը հավասար է " + vol);
            vol = mybox2.volume();
            System.out.println("Ծավալը հավասար է " + vol);
        }
    }
}