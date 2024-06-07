package AbstractFactory;

import AbstractProduct.Driver;
import AbstractProduct.Movement;

public interface TaxiFactory {
    Driver createDriver();
    Movement createMovement();
}
