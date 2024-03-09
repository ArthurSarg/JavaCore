package classwork.lesson11;

public class ObjectExample {

    public static void main(String args[]) {
        Box myboxl = new Box();
        Box mybox2 = new Box();
        myboxl.width = 10;
        myboxl.height = 20;
        myboxl.depth = 15;
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        myboxl.volume();
        mybox2.volume();

    }

}
