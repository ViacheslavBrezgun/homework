package finalControlWork.utils;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Pizza> pizzas;

    public Menu(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }
}
