package com.bootcamp.helper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DiscountCalculatorTest {

    private static final double DELTA = 0.0001;

    // Escenario 1
    @Test
    void shouldCalculateDiscountWhenPriceIsGreaterThanZero() {
        double valorProducto = 100.0;
        DiscountCalculator calculator = new DiscountCalculator(20.0);

        double descuentoCalculado =
                calculator.calculateDiscount(valorProducto);

        assertEquals(20.0, descuentoCalculado, DELTA);
    }

    // Escenario 2
    @Test
    void shouldReturnZeroWhenPriceIsLessThanZero() {
        double valorProducto = -100.0;
        DiscountCalculator calculator = new DiscountCalculator(20.0);

        double descuentoCalculado =
                calculator.calculateDiscount(valorProducto);

        assertEquals(0.0, descuentoCalculado, DELTA);
    }

    // Escenario 3
    @Test
    void shouldReturnZeroWhenPriceIsZero() {
        double valorProducto = 0.0;
        DiscountCalculator calculator = new DiscountCalculator(20.0);

        double descuentoCalculado =
                calculator.calculateDiscount(valorProducto);

        assertEquals(0.0, descuentoCalculado, DELTA);
    }

    // Escenario 4
    @Test
    void shouldReturnZeroWhenDiscountIsZero() {
        double valorProducto = 100.0;
        DiscountCalculator calculator = new DiscountCalculator(0.0);

        double descuentoCalculado =
                calculator.calculateDiscount(valorProducto);

        assertEquals(0.0, descuentoCalculado, DELTA);
    }

    // Escenario 5
    @Test
    void shouldReturnZeroWhenDiscountIsNegative() {
        double valorProducto = 100.0;
        DiscountCalculator calculator = new DiscountCalculator(-10.0);

        double descuentoCalculado =
                calculator.calculateDiscount(valorProducto);

        assertEquals(0.0, descuentoCalculado, DELTA);
    }

    // Escenario 6
    @Test
    void shouldReturnFullPriceWhenDiscountIsOneHundredPercent() {
        double valorProducto = 100.0;
        DiscountCalculator calculator = new DiscountCalculator(100.0);

        double descuentoCalculado =
                calculator.calculateDiscount(valorProducto);

        assertEquals(100.0, descuentoCalculado, DELTA);
    }

    // Escenario 7
    @Test
    void shouldReturnZeroWhenDiscountIsGreaterThanOneHundredPercent() {
        double valorProducto = 100.0;
        DiscountCalculator calculator = new DiscountCalculator(110.0);

        double descuentoCalculado =
                calculator.calculateDiscount(valorProducto);

        assertEquals(0.0, descuentoCalculado, DELTA);
    }

    // Escenario 8
    @Test
    void shouldCalculateDiscountForDifferentPriceAndRate() {
        double valorProducto = 250.0;
        DiscountCalculator calculator = new DiscountCalculator(15.0);

        double descuentoCalculado =
                calculator.calculateDiscount(valorProducto);

        assertEquals(37.5, descuentoCalculado, DELTA);
    }

    // Escenario 9
    @Test
    void shouldCalculateDiscountWhenPriceHasDecimals() {
        double valorProducto = 99.99;
        DiscountCalculator calculator = new DiscountCalculator(10.0);

        double descuentoCalculado =
                calculator.calculateDiscount(valorProducto);

        assertEquals(9.999, descuentoCalculado, DELTA);
    }
}