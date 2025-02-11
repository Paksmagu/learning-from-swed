package ee.swedbank.first.challenge;

import ee.swedbank.first.challenge.order.Order;
import ee.swedbank.first.challenge.order.OrderItem;
import ee.swedbank.first.challenge.products.ProductType;
import ee.swedbank.first.challenge.products.electronics.ComputerType;
import ee.swedbank.first.challenge.products.electronics.Desktop;
import ee.swedbank.first.challenge.products.electronics.Laptop;
import ee.swedbank.first.challenge.products.furniture.Chair;
import ee.swedbank.first.challenge.products.furniture.Country;
import ee.swedbank.first.challenge.products.furniture.Desk;
import ee.swedbank.first.challenge.products.ProductForSale;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Store {
    private final List<ProductForSale> productForSaleList = new ArrayList<>();

    public static void main(String[] args) {
        Store store = new Store();
        store.addNewProduct(new Desktop(ProductType.DESKTOP, 700, "Desktop Computer", ComputerType.LEGACY_COMPUTER));
        store.addNewProduct(new Laptop(ProductType.LAPTOP, 900, "Laptop", ComputerType.MODERN_COMPUTER));
        store.addNewProduct(new Desk(ProductType.DESK, 100, "Computer Desk", Country.LATVIA));
        store.addNewProduct(new Chair(ProductType.CHAIR, 200, "Reading chair", Country.ESTONIA));

        store.listProductsForSale();

        Order firstOrder = new Order();
        firstOrder.addItem(new OrderItem(2, store.getByID(2)));
        firstOrder.addItem(new OrderItem(1, store.getByID(1)));
        firstOrder.printOrder();

        Order secondOrder = new Order();
        secondOrder.addItem(new OrderItem(5, store.getByID(4)));
        secondOrder.addItem(new OrderItem(1, store.getByID(1)));
        secondOrder.addItem(new OrderItem(1, store.getByID(3)));
        secondOrder.printOrder();
    }

    private ProductForSale getByID(int id) {
        Optional<ProductForSale> any = productForSaleList.stream().filter(it -> it.getId() == id).findAny();
        if (any.isPresent()) {
            return any.get();
        } else {
            throw new RuntimeException("Unable to find object by ID.");
        }
    }

    private void addNewProduct(ProductForSale productForSale) {
        productForSaleList.add(productForSale);
    }

    private void listProductsForSale() {
        productForSaleList.forEach(ProductForSale::showDetails);
    }
}
