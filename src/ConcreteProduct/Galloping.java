package ConcreteProduct;

import AbstractProduct.Movement;

//Concrete Product B2
public class Galloping implements Movement {
    @Override
    public void move() {
        System.out.println("The vehicle is galloping.");
    }
}
