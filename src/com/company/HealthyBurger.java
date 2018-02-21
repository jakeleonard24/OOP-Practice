package com.company;

public class HealthyBurger extends Burger {

    private String topping5;
    private String topping6;

    public HealthyBurger(String meat) {
        super("rye bread", meat);
        System.out.println("healthy burger constructor");
    }

    public void additionalToppings(String topping1, String topping2, String topping3, String topping4, String topping5) {
        this.additionalToppings(topping1, topping2, topping3, topping4, topping5);
    }

    public void additionalToppings(String topping1, String topping2, String topping3, String topping4, String topping5, String toppings6) {
        super.addToppings(topping1, topping2, topping3, topping4);
        this.topping5 = topping5;
        this.topping6 = topping6;
    }

    @Override
    public double getPrice() {
        double normalPrice = super.getPrice();
        if (this.topping5 != null) {
            normalPrice += .50;
        }

        if (this.topping6 != null) {
            normalPrice += .50;
        }

        return normalPrice;
    }
}
