package com.packt.chapter1;

public class BinaryToDecimalConverter {
    public int convertBinaryToDecimal(String binaryString) {
        int conversion = 1;
        int result = 0;

        int length = binaryString.length();
        for (int i = 1; i <= length; i++) {
            if (binaryString.charAt(length - i) == '1') {
                result += conversion;
            }
            conversion *= 2;
        }
        return result;
    }
}
