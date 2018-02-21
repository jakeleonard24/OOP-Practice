package com.company;

import com.sun.deploy.util.StringUtils;

public class Burger {
    private String rollType;
    private String meat;
    private double price = 3.00;
    private String topping1;
    private String topping2;
    private String topping3;
    private String topping4;

    public Burger(String rollType, String meat) {
        System.out.println("burger constructor");
        this.rollType = rollType;
        this.meat = meat;
    }

    public void addToppings(String topping1) {
        this.addToppings(topping1, null, null, null);
    }

    public void addToppings(String topping1, String topping2, String topping3, String topping4){
        System.out.println("burger toppings");
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.topping4 = topping4;
    }

    public void addToppings(String topping1, String topping2) {
        this.addToppings(topping1, topping2, null, null);
    }

    public void addToppings(String topping1, String topping2, String topping3) {
        this.addToppings(topping1, topping2, topping3, null);
    }

    public double getPrice() {
        if(getTopping1() != null){
            price += .50;
        }

        if(getTopping2() != null){
            price += .50;
        }

        if(getTopping3() != null){
            price += .50;
        }

        if(getTopping4() != null){
            price += .50;
        }
        return price;
    }

    public String getTopping1() {
        return topping1;
    }

    public String getTopping2() {
        return topping2;
    }

    public String getTopping3() {
        return topping3;
    }

    public String getTopping4() {
        return topping4;
    }

}
