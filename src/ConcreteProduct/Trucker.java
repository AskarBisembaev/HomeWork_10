package ConcreteProduct;

import AbstractProduct.Driver;

//Concrete Product A1
public class Trucker implements Driver {
    @Override
    public void drive() {
        System.out.println("Trucker is driving.");
    }
}
