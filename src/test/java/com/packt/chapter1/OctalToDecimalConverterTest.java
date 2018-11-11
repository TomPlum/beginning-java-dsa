package com.packt.chapter1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OctalToDecimalConverterTest {
    private final OctalToDecimalConverter converter = new OctalToDecimalConverter();

    @Test
    void conversionTest() {
        int decimal = converter.convertOctalToDecimal("17");
        assertThat(decimal).isEqualTo(15);
    }
}
