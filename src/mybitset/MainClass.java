package mybitset;

import java.util.BitSet;

public class MainClass {
    public static void main(String[] args) {
        BitSet b1 = new BitSet(4);
        BitSet b2 = new BitSet(4);
        BitSet b3 = new BitSet(4);
//Al parecer solo se podrían llenar cuando los indices coinciden con los values. No existiria forma de llenar por ejemplo {0,0,0,0,0}
        b1.set(0,true);
        b1.set(1,true);
        b1.set(2,true);
        b1.set(3,true);

        b2.set(0,false);
        b2.set(1,true);
        b2.set(2,false);
        b2.set(3,true);

        b3.set(3,9,true);

        System.out.println("B1:" + b1);
        System.out.println("B2:" + b2);
        System.out.println("B3:" + b3);

        //b1.and(b2);
        b1.xor(b2); //only one of them true, never both of them
        System.out.println("B1:" + b1);

        BitSet bitSet = new BitSet();


        System.out.println("Bitset:" + bitSet);
    }
}
