package com.bootcamp.helper;

public class DiscountCalculator {

    private double DISCOUNT_RATE;

    public DiscountCalculator(double DISCOUNT_RATE) {
        this.DISCOUNT_RATE = DISCOUNT_RATE;
    }

    public double calculateDiscount(double price) {

        if (price <= 0) {
            return 0;
        }

        return price * DISCOUNT_RATE / 100;
    }
}