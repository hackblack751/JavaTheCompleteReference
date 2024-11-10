package org.example;

public class CharacterWrapper {

    public static void main(String[] args) {
        // Character là wrapper cho type character.

        // .valueOf(): dùng để initialize một Character object.
        Character ch1 = Character.valueOf('a');

        // Character includes several static methods that categorize characters and
        //alter their case. Character có nhiều static method để ktra 1 ký tự là digit,
        //letter hay whitespace,...

        char[] chArr = {'a', 'b', '5', '!', 'A'};
        for(int i=0; i < chArr.length; i++) {
            if(Character.isDigit(chArr[i])) {
                System.out.println(chArr[i] + " is a digit");
            }
            if(Character.isLetter(chArr[i])) {
                System.out.println(chArr[i] + " is a letter.");
            }
            if(Character.isWhitespace(chArr[i])) {
                System.out.println(chArr[i] + " is a whitespace");
            }
            if(Character.isUpperCase(chArr[i])) {
                System.out.println(chArr[i] + " is uppercase");
            }
            if(Character.isLowerCase(chArr[i])) {
                System.out.println(chArr[i] + " is lowercase.");
            }
        }

        Character ch2 = 'e';
        System.out.println("Character.isLetterOrDigit(ch2): " + Character.isLetterOrDigit(ch2));

        // Unicode Code Point support for Character class.
        // - Lúc xưa, chỉ cần 16 bit để chứa toàn bộ ký tự Unicode tương ứng với kích thước
        //của kiểu char, các ký tự Unicode có giá trị từ 0 ~ FFFF. Theo thời gian, bảng mã
        //Unicode đc mở rộng để hỗ trợ các ký tự mới, kicích thước của nó lên tới 0 ~ 10FFFF

        // - Code point: là identify của 1 character trong bảng mã Unicode, nó có giá trị
        //từ 0 ~ 10FFFF

        // - supplemental character: là các character có code point nằm ngoài FFFF
        // - basic multilingual plane(BMP): là các character có code point nằm trong 0 ~ FFFF

        // - Do sự mở rộng của bảng Unicode. kiểu char ko đủ kích thước để chứa. Các nhà phát
        //triển Java đã tạo ra 2 cách để xử lý vấn đề này
        //  + Cách 1: dùng 2 char để biểu diễn ký tự supplemental, char thứ 1 đgl high surrogate,
        //char thứ 2 đgl low surrogate. Có thể dùng Character.codePointAt() để chuyển đổi từ
        //supplemental character qua code point
        String musicalSymbol = "\uD834\uDD1E"; // 𝄞
        System.out.println(musicalSymbol);
        System.out.println(musicalSymbol.getBytes().length);
        System.out.println("Character.codePointAt(musicalSymbol, 0): " + Character.codePointAt(musicalSymbol, 0));

        // Các supplemental character dùng đến 2 char (4 byte) để biểu diễn, length của character đó
        //là 2. Do đó, một string có length là 100 chưa chắc chứa 100 ký tự

        //  + Cách 2: Java overload lại 1 số method của Character nhận vào tham số kiểu int thay vì
        //char vì int có kích thước đủ lớn để biểu diễn các supplemental character.
        char ch3 = 'a';
        int codePoint = ch3;
        System.out.println("Character.isLetter(codePoint): " + Character.isLetter(codePoint));




    }

}
