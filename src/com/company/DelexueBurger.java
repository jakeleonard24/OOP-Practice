package com.company;

public class DelexueBurger extends Burger {
    private boolean chips;
    private boolean drink;

    public DelexueBurger(String rollType, String meat){
        this(rollType, meat, true, true);
    }

    public DelexueBurger(String rollType, String meat, boolean chips, boolean drink) {
        super(rollType, meat);
        this.chips = chips;
        this.drink = drink;
    }

    @Override
    public double getPrice() {
        double normalPrice = super.getPrice();
        if (this.chips != false) {
            normalPrice += 1.00;
        }

        if (this.drink != false) {
            normalPrice += 1.50;
        }

        return normalPrice;
    }
}
