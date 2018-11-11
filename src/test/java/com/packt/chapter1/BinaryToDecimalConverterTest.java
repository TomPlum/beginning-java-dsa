package com.packt.chapter1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryToDecimalConverterTest {
    private final BinaryToDecimalConverter converter = new BinaryToDecimalConverter();

    @Test
    void smallNumberConversion() {
        int decimal = converter.convertBinaryToDecimal("10110");
        assertThat(decimal).isEqualTo(22);
    }

    @Test
    void largeNumberConversion() {
        int decimal = converter.convertBinaryToDecimal("11001110000");
        assertThat(decimal).isEqualTo(1648);
    }
}
