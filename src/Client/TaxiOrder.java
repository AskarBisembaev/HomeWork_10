package Client;

import AbstractFactory.TaxiFactory;
import AbstractProduct.Driver;
import AbstractProduct.Movement;


public class TaxiOrder {
    private Driver driver;
    private Movement movement;

    public TaxiOrder(TaxiFactory factory) {
        driver = factory.createDriver();
        movement = factory.createMovement();
    }

    public void completeOrder() {
        driver.drive();
        movement.move();
    }
}
