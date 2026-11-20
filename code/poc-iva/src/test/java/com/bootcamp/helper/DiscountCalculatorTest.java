package com.bootcamp.helper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DiscountCalculatorTest {

    private static final double DELTA = 0.0001;

    @Test
    void shouldCalculateDiscountWhenPriceIsGreaterThanZero() {

        double valorProducto = 100.0;
        DiscountCalculator calculator =
                new DiscountCalculator(20.0);

        double descuentoCalculado =
                calculator.calculateDiscount(valorProducto);

        assertEquals(
                20.0,
                descuentoCalculado,
                DELTA
        );
    }

    @Test
    void shouldReturnZeroWhenPriceIsLessThanZero() {

        double valorProducto = -100.0;
        DiscountCalculator calculator =
                new DiscountCalculator(20.0);

        double descuentoCalculado =
                calculator.calculateDiscount(valorProducto);

        assertEquals(
                0.0,
                descuentoCalculado,
                DELTA
        );
    }

    @Test
    void shouldReturnZeroWhenPriceIsZero() {

        double valorProducto = 0.0;
        DiscountCalculator calculator =
                new DiscountCalculator(20.0);

        double descuentoCalculado =
                calculator.calculateDiscount(valorProducto);

        assertEquals(
                0.0,
                descuentoCalculado,
                DELTA
        );
    }
}