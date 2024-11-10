package org.example;

public class TheSystemClass {
    public static void main(String[] args) {
        // System class gồm tập hợp các static method, variable và constant.

        // currentTimeMillis(): trả về số milli giây tính từ 1970/01/01 00:00:00
        System.out.println("Current time in milli seconds: " + System.currentTimeMillis() + " ms");

        // arraycopy(src, srcIndex, dest, destIndex, length): copy giá trị trong array, cách này
        //efficient hơn là loop vì ng ta nói thế.
        char[] chArr1 = {'A', 'B', 'C', 'D', 'E', 'F'};
        char[] chArr2 = {'A', 'B', 'C', 'C', 'C', 'C'};

        System.out.println("Before copying ");
        System.out.println("chArr1: " + String.valueOf(chArr1));
        System.out.println("chArr2: " + String.valueOf(chArr2));
        System.out.println();

        System.out.println("After copying ");
        System.arraycopy(chArr1, 3, chArr2, 3, 3);
        System.out.println("chArr1: " + String.valueOf(chArr1));
        System.out.println("chArr2: " + String.valueOf(chArr2));



    }
}
