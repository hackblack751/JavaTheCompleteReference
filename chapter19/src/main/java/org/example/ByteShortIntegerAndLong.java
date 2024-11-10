package org.example;

public class ByteShortIntegerAndLong {

    public static void main(String[] args) {
        // Byte, Short, Integer và Long là wrapper class cho các type byte, short, integer
        //và long.

        // Các class đó có định nghĩa 1 số method giúp parse integer từ string hay cho phép
        //chỉ định radix (cơ số) để thực hiện chuyển đổi.

        // valueOf(): static method để initialize object thông qua giá trị được pass vào.
        Integer i1 = Integer.valueOf("1723");
        System.out.println("i1: " + i1);

        // valueOf(String str, int radix): chỉ dịnh cơ số, có thể tận dụng để parse các giá
        //trị đc biểu diễn ở các hệ cơ số khác nhau.
        Integer i2 = Integer.valueOf("01000000", 2);
        System.out.println("i2: " + i2); // 64

        // Integer.compare(num1, num2): So sánh 2 số
        // .compareTo(num): so sánh giá trị của obj gọi method với tham số được pass vào

        // Integer.compareUnsigned(num1, num2): so sánh giá trị tuyệt đối với 2 số
        Integer i3 = -1829;
        System.out.println("Integer.compareUnsigned(i1, i3): " + Integer.compareUnsigned(i1, i3));

        // doubleValue(): trả về giá trị double
        Double d1 = i3.doubleValue();
        System.out.println("d1: " + d1);

        // Integer.max(i1, i2): trả về giá trị lớn nhất.
        // Integer.min(i1, i2): trả về giá trị nhỏ nhất.
        System.out.println();

        // Một số constant
        System.out.println("Integer.BYTES: " + Integer.BYTES + " bytes");
        System.out.println();

        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println();

        System.out.println("Integer.SIZE: " + Integer.SIZE + " bits");

        // Converting Numbers to and from String
        // Byte, Short, Integer và Long có parseXXX() để convert String thành integer. Điểm khác
        //biệt với valueOf() là parseXXX() trả về primitive value thay vì obj.
        String input = "17232";
        Integer i4 = Integer.parseInt(input);
        System.out.println("i4: " + i4);

        // parseInteger(str, radix)
        String hex = Integer.toHexString(i4); // convert integer to hex representation
        System.out.println("hex: " + hex);
        System.out.println("integer: " + Integer.parseInt(hex, 16));

        // toBinaryString
        Integer i5 = 83714;
        System.out.println("Binary: " + Integer.toBinaryString(i5));

    }
}
