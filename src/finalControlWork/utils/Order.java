package finalControlWork.utils;

import java.util.List;

public class Order {
    private List<Pizza> pizzas;

    public Order(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }
}
