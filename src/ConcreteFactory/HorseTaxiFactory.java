package ConcreteFactory;

import AbstractFactory.TaxiFactory;
import AbstractProduct.Driver;
import AbstractProduct.Movement;
import ConcreteProduct.Coachman;
import ConcreteProduct.Galloping;



public class HorseTaxiFactory implements TaxiFactory {
    @Override
    public Driver createDriver() {
        return new Coachman();
    }

    @Override
    public Movement createMovement() {
        return new Galloping();
    }
}
