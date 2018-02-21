package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HealthyBurger veggieBurger = new HealthyBurger("veggie pattie");
        veggieBurger.additionalToppings("cheese", "lettuce", "onions", "tomato", "mayo", "mustard");

        Burger regBurger = new Burger("BUN", "MEAT");
        regBurger.addToppings("dsf", "kmds", "sdf");

        DelexueBurger baconator = new DelexueBurger("Brioche", "BACON");

        baconator.addToppings("Cheese","lettuce", "onions", "tomato");

        System.out.println(regBurger.getPrice());
        System.out.println(veggieBurger.getPrice());
        System.out.println(baconator.getPrice());
    }




}
