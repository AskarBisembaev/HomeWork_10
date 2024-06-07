package ConcreteFactory;

import AbstractFactory.TaxiFactory;
import AbstractProduct.Driver;
import AbstractProduct.Movement;
import ConcreteProduct.Crawling;
import ConcreteProduct.Trucker;



public class TruckTaxiFactory implements TaxiFactory {
    @Override
    public Driver createDriver() {
        return new Trucker();
    }

    @Override
    public Movement createMovement() {
        return new Crawling();
    }
}
