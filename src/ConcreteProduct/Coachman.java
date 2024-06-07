package ConcreteProduct;

import AbstractProduct.Driver;

//Concrete Product A2
public class Coachman implements Driver {
    @Override
    public void drive() {
        System.out.println("Coachman is driving.");
    }
}