package ConcreteProduct;

import AbstractProduct.Movement;

//Concrete Product B1
public class Crawling implements Movement {
    @Override
    public void move() {
        System.out.println("The vehicle is crawling.");
    }
}
