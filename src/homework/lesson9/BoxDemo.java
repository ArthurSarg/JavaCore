package homework.lesson9;

import homework.lesson9.Box;

public class BoxDemo {
    public static void main(String[] args) {
        Box myboxl = new Box();
        Box mybox2 = new Box();
        double vol;
        myboxl.setDim(7, 11, 18);
        mybox2.setDim(4, 9, 13);
        vol = myboxl.volume();
        System.out.println ("Ծավալը հավասար է " + vol);
        vol = mybox2.volume();
        System.out.println("Ծավալը հավասար է " + vol);
    }
}

