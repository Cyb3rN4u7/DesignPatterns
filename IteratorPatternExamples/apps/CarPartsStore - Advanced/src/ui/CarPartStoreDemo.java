package ui;

import model.CarPart;
import model.Store;

public class CarPartStoreDemo {

    public static void main(String[] args) {
        Store carPartStore = new Store("Athens branch");
        carPartStore.showPartsAvailable();
        CarPart part = new CarPart(051,"Wind Shield",180);

        System.out.println("\nCustomer is bying part : " + part);
        carPartStore.sellPart(part);

        carPartStore.showPartsAvailable();
    }
}
