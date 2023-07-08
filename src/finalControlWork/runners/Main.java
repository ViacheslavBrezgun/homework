package finalControlWork.runners;

import finalControlWork.api.Pizzeria;
import finalControlWork.utils.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("Маргарита", Arrays.asList("Замес теста", "Начало выпекания", "Завершение выпекания"));
        Pizza pizza2 = new Pizza("Пепперони", Arrays.asList("Замес теста", "Добавление колбасы", "Начало выпекания", "Завершение выпекания"));
        Pizza pizza3 = new Pizza("Гавайская", Arrays.asList("Замес теста", "Добавление ананасов", "Добавление ветчины", "Начало выпекания", "Завершение выпекания"));

        Menu menu = new Menu(Arrays.asList(pizza1, pizza2, pizza3));

        Pizzeria pizzeria = new PizzeriaImpl(menu);

        Menu pizzeriaMenu = pizzeria.getMenu();
        List<Pizza> pizzas = pizzeriaMenu.getPizzas();
        System.out.println("Меню пиццерии:");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.getName());
        }

        List<Pizza> orderPizzas = Arrays.asList(pizza1, pizza2);
        System.out.println("Заказ ");
        for (int i = 0; i < orderPizzas.size(); i++) {
            System.out.println(orderPizzas.get(i).toString());
        }
        Order order = new Order(orderPizzas);
        Ticket ticket = pizzeria.placeOrder(order);
        System.out.println("Заказ сформирован. Номер квитка: " + ticket.getOrderId());

        List<String> orderStatus = pizzeria.getOrderStatus(ticket);
        System.out.println("Стадии приготовления заказа: ");
        for (String status : orderStatus) {
            System.out.println(status);
        }

        Order retrievedOrder = pizzeria.getOrder(ticket);
        System.out.println("Полученный заказ:");
        List<Pizza> retrievedPizzas = retrievedOrder.getPizzas();
        for (Pizza pizza : retrievedPizzas) {
            System.out.println(pizza.getName());
        }
    }
}
