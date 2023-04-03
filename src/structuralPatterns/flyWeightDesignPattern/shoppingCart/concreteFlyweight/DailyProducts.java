package structuralPatterns.flyWeightDesignPattern.shoppingCart.concreteFlyweight;

import structuralPatterns.flyWeightDesignPattern.shoppingCart.flyweight.Product;

public class DailyProducts implements Product {
    private final String name;
    private final int price;

    private final double discount;

    public DailyProducts(String name, int price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public void display() {
        System.out.println("DailyProducts{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}');
    }
}
