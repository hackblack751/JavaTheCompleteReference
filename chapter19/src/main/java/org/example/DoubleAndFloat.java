package org.example;

public class DoubleAndFloat {

    public static void main(String[] args) {
        // Double và Float là wrapper cho giá trị double và float.

        // Float(double num), Float(float num), Float(String str) các constructor này đều
        //đã deprecated. Do đó, dùng .valueOf() để tạo Float
        Float f1 = Float.valueOf(172.23f);

        Double d1 = Double.valueOf("182.931");

        // Một số constant thú vị trong Double và Float
        System.out.println("Float.BYTES: " + Float.BYTES + " bytes");
        System.out.println("Double.BYTES: " + Double.BYTES + " bytes");
        System.out.println();

        System.out.println("Float.SIZE: " + Float.SIZE + " bits");
        System.out.println("Double.SIZE: " + Double.SIZE + " bits");
        System.out.println();

        System.out.println("Float.MAX_VALUE: " + Float.MAX_VALUE);
        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println();

        System.out.println("Float.NaN: " + Float.NaN );
        System.out.println("Double.NaN: " + Double.NaN);
        System.out.println();

        System.out.println("Float.POSITIVE_INFINITY: " + Float.POSITIVE_INFINITY); // 1.0f/0
        System.out.println("Double.POSITIVE_INFINITY: " + Double.POSITIVE_INFINITY); // 1.0f/0
        System.out.println();

        System.out.println("Float.NEGATIVE_INFINITY: " + Float.NEGATIVE_INFINITY); // -1.0f/0
        System.out.println("Double.NEGATIVE_INFINITY: " + Double.NEGATIVE_INFINITY); // -1.0/0
        System.out.println();

        // Commonly used methods defined in Double

        // compareTo(Double d): Double implement Comparable<T> interface
        Double d2 = Double.valueOf(92172.832);
        System.out.println("d2.compareTo(d1): " + d2.compareTo(d1));

        // intValue(): trả về int value, loại bỏ phần thập phân
        System.out.println("d2.intValue(): " + d2.intValue());

        // longValue(): trả về long value, loại bỏ phẩn thập phân
        System.out.println("d2.longValue(): " + d2.longValue());

        // Double.max(d1, d2): trả về giá trị max
        System.out.println("Double.max(d1, d2): " + Double.max(d1, d2));

        // Double.min(d1, d2): trả về giá trị min
        System.out.println("Double.min(d1, d2): " + Double.min(d1, d2));

        // Double.isInfinite(d): check xem có phải là infinity ko
        System.out.println("Double.isInfinite(Double.POSITIVE_INFINITY): " + Double.isInfinite(Double.POSITIVE_INFINITY));

        // Double.isFinite(d): check xem có phải là finity ko
        System.out.println("Double.isFinite(d1): " + Double.isFinite(d1));

        // Double.compare(d1, d2): so sánh giá trị d1 và d2
        System.out.println("Double.compare(d1, d2): " + Double.compare(d1, d2));

        Double d3 = 0/0.0;
        System.out.println("d3.isNan(): " + d3.isNaN());
        

    }
}
