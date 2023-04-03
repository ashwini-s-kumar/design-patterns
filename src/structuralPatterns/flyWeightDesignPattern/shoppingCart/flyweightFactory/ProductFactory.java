package structuralPatterns.flyWeightDesignPattern.shoppingCart.flyweightFactory;

import structuralPatterns.flyWeightDesignPattern.shoppingCart.concreteFlyweight.DailyProducts;
import structuralPatterns.flyWeightDesignPattern.shoppingCart.flyweight.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
    private Map<String , Product> products;

    public ProductFactory() {
        this.products =  new HashMap<>();
    }

    public Product getProduct(String name, int price , double discount) {
        if (products.containsKey(name)) {
            return products.get(name);
        } else {
            Product product = new DailyProducts(name, price, discount);
            products.put(name, product);
            return product;
        }
    }
}
