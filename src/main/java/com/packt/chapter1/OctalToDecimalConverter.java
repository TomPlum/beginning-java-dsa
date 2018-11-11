package com.packt.chapter1;

public class OctalToDecimalConverter {
    public int convertOctalToDecimal(String octal) {
        int result = 0;

       for (int i = 1; i <= octal.length(); i++) {
           int octalDigit = Integer.parseInt(String.valueOf(octal.charAt(octal.length() - i)));
           result += Math.pow(8, i - 1) * octalDigit;
       }
        return result;
    }
}
