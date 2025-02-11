package ee.swedbank.first.challenge.order;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Order {
    private static int ORDER_COUNTER = 1;

    private final int orderIndex;
    private final List<OrderItem> orderItems;

    public Order() {
        orderIndex = ORDER_COUNTER++;
        orderItems = new ArrayList<>();
    }

    public void addItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public void printOrder() {
        System.out.println("---------------");
        System.out.printf("Order %d%n", orderIndex);
        orderItems.forEach(OrderItem::printOrderItem);
        AtomicInteger price = new AtomicInteger(0);
        orderItems.forEach(it -> price.addAndGet(it.getPrice()));
        System.out.printf("Total sales: %d euro.%n", price.get());
    }
}
