package finalControlWork.tests.utils;

import finalControlWork.api.Pizzeria;
import finalControlWork.utils.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PizzeriaImplTest {
    private Pizzeria pizzeria;
    private Menu menu;

    @BeforeEach
    public void setup() {

        Pizza pizza1 = new Pizza("Маргарита", Arrays.asList("Замес теста", "Начало выпекания", "Завершение выпекания"));
        Pizza pizza2 = new Pizza("Пепперони", Arrays.asList("Замес теста", "Добавление колбасы", "Начало выпекания", "Завершение выпекания"));
        Pizza pizza3 = new Pizza("Гавайская", Arrays.asList("Замес теста", "Добавление ананасов", "Добавление ветчины", "Начало выпекания", "Завершение выпекания"));
        menu = new Menu(Arrays.asList(pizza1, pizza2, pizza3));

        pizzeria = new PizzeriaImpl(menu);
    }

    @Test
    public void testGetMenu() {
        Menu pizzeriaMenu = pizzeria.getMenu();
        List<Pizza> pizzas = pizzeriaMenu.getPizzas();

        Assertions.assertEquals(3, pizzas.size());
        Assertions.assertEquals("Маргарита", pizzas.get(0).getName());
        Assertions.assertEquals("Пепперони", pizzas.get(1).getName());
        Assertions.assertEquals("Гавайская", pizzas.get(2).getName());
    }

    @Test
    public void testPlaceOrder() {
        List<Pizza> orderPizzas = Arrays.asList(menu.getPizzas().get(0), menu.getPizzas().get(1));
        Order order = new Order(orderPizzas);
        Ticket ticket = pizzeria.placeOrder(order);
        Assertions.assertNotNull(ticket);
        Assertions.assertTrue(ticket.getOrderId() > 0);
    }

    @Test
    public void testGetOrder() {
        List<Pizza> orderPizzas = Arrays.asList(menu.getPizzas().get(0), menu.getPizzas().get(1));
        Order order = new Order(orderPizzas);
        Ticket ticket = pizzeria.placeOrder(order);

        Order retrievedOrder = pizzeria.getOrder(ticket);

        Assertions.assertNotNull(retrievedOrder);
        Assertions.assertEquals(orderPizzas.size(), retrievedOrder.getPizzas().size());
        Assertions.assertEquals(orderPizzas.get(0).getName(), retrievedOrder.getPizzas().get(0).getName());
        Assertions.assertEquals(orderPizzas.get(1).getName(), retrievedOrder.getPizzas().get(1).getName());
    }
}