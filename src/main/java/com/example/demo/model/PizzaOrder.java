package com.example.demo.model;

public class PizzaOrder {

    private String pizzaType;
    private String size;
    private String toppings;
    private int quantity;
    private double totalPrice;

    public PizzaOrder(String pizzaType, String size, String toppings, int quantity, double totalPrice) {
        this.pizzaType = pizzaType;
        this.size = size;
        this.toppings = toppings;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public String getPizzaType() { return pizzaType; }
    public String getSize() { return size; }
    public String getToppings() { return toppings; }
    public int getQuantity() { return quantity; }
    public double getTotalPrice() { return totalPrice; }
}
