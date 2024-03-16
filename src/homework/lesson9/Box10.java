package homework.lesson9;

public class Box10 {
    public static void main(String[] args) {
        class BoxDemo10 {
            public static void main(String[] args) {
                class Box {
                    double width;
                    double height;
                    double depth;

                    double Box(double w, double h, double d) {
                        width = w;
                        height = h;
                        depth = d;
                        {
                            return width * height * depth;


                        }
                    }
                }
            }
        }
    }
}
