package finalControlWork.utils;

import finalControlWork.api.Pizzeria;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;


public class PizzeriaImpl implements Pizzeria {
    private Menu menu;
    private Map<Ticket, Order> orders;
    private int orderIdCounter;

    public PizzeriaImpl(Menu menu) {
        this.menu = menu;
        this.orders = new HashMap<>();
        this.orderIdCounter = 1;
    }

    /**
     * выводит меню
     *
     * @return menu
     */
    @Override
    public Menu getMenu() {
        return menu;
    }

    /**
     * формирует заказ
     *
     * @param order принимает список заказанных пицц
     * @return ticket возвращает квиток
     */
    @Override
    public Ticket placeOrder(Order order) {
        Ticket ticket = new Ticket(orderIdCounter++, new Date());
        orders.put(ticket, order);
        return ticket;
    }

    /**
     * Отдаёт информацию о стадиях приготовления заказа по квитку.
     *
     * @param ticket принимает квиток
     * @return status возвращает список стадий приготовления
     */
    @Override
    public List<String> getOrderStatus(Ticket ticket) {
        List<String> status = new ArrayList<>();
        status.add("Заказ принят " + ticket.getIssueTime());
        Order order = orders.get(ticket);
        if (order!= null) {
            List<Pizza> pizzas = order.getPizzas();

            for (int i = 0; i < pizzas.size(); i++) {
                int counter=(int)(Math.random()*((6-2)+1));
                status.add("Начато приготовление пиццы " + pizzas.get(i).getName() + " " + getCurrentTime());
                List<String> preparationStages = pizzas.get(i).getPreparationStages();

                for (String stage : preparationStages) {
                    counter=counter+(int)(Math.random()*((6-2)+1));
                    status.add(stage + " " + getCurrentTimePlus(counter));

                }
            }

            status.add("Заказ пакуется " + getCurrentTimePlus(20));
            status.add("Заказ готов " + getCurrentTimePlus(25));
        }
        return status;
    }

    /**
     * Отдаёт заказ по квитку
     *
     * @param ticket принимает квиток
     * @return возвращает список приготовленных пицц
     */
    @Override
    public Order getOrder(Ticket ticket) {
        return orders.get(ticket);
    }

    /**
     * выводит текущее время в формате HH:MM
     *
     * @return время
     */
    private String getCurrentTime() {
        Date currentTime = new Date();
        return String.format("%tR", currentTime);
    }
    private String getCurrentTimePlus(int min) {
        LocalTime time=LocalTime.now();
        LocalTime time1=time.plusMinutes(min);
        return String.format("%tR", time1);
    }
}