package finalControlWork.api;

import finalControlWork.utils.Menu;
import finalControlWork.utils.Order;
import finalControlWork.utils.Ticket;

import java.util.List;

public interface Pizzeria {
    Menu getMenu();

    Ticket placeOrder(Order order);

    List<String> getOrderStatus(Ticket ticket);

    Order getOrder(Ticket ticket);
}
