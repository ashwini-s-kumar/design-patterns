package structuralPatterns.flyWeightDesignPattern.shoppingCart;

import structuralPatterns.flyWeightDesignPattern.shoppingCart.flyweight.Product;
import structuralPatterns.flyWeightDesignPattern.shoppingCart.flyweightFactory.ProductFactory;

public class Demo {
    public static void main(String [] arr){

        ProductFactory productFactory = new ProductFactory();
        Product product1 = productFactory.getProduct("product1", 100, 10.5);
        System.out.println("product 1 : " + product1);
        product1.display();

        Product product2 = productFactory.getProduct("product2", 150, 2);
        System.out.println("product 2 : " + product2);
        product2.display();

        Product product3 = productFactory.getProduct("product1", 100, 10.5);
        System.out.println("product 3 : " + product3);
        product3.display();

        System.out.println("Reference of product1 and product3 is same");

    }
}
