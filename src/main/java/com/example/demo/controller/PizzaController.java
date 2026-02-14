package com.example.demo.controller;

import com.example.demo.model.PizzaOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PizzaController {

    String[] pizzaTypes = {"Margherita", "Pepperoni", "BBQ Chicken", "Vegetarian"};
    double[] pizzaPrices = {199, 249, 299, 179};


    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/order")
    public String placeOrder(
            @RequestParam String pizzaType,
            @RequestParam String size,
            @RequestParam String toppings,
            @RequestParam int quantity,
            Model model) {

        double basePrice = 0;

        for (int i = 0; i < pizzaTypes.length; i++) {
            if (pizzaTypes[i].equals(pizzaType)) {
                basePrice = pizzaPrices[i];
                break;
            }
        }

        double total = basePrice * quantity;

        PizzaOrder order = new PizzaOrder(pizzaType, size, toppings, quantity, total);
        model.addAttribute("order", order);

        return "index";
    }
}
