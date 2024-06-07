import AbstractFactory.TaxiFactory;
import Client.TaxiOrder;
import ConcreteFactory.HorseTaxiFactory;
import ConcreteFactory.TruckTaxiFactory;


public class Main {
    public static void main(String[] args) {
        // Заказ грузового такси
        TaxiFactory truckTaxiFactory = new TruckTaxiFactory();
        TaxiOrder truckOrder = new TaxiOrder(truckTaxiFactory);
        truckOrder.completeOrder();

        // Заказ гужевой повозки
        TaxiFactory horseTaxiFactory = new HorseTaxiFactory();
        TaxiOrder horseOrder = new TaxiOrder(horseTaxiFactory);
        horseOrder.completeOrder();
    }
}