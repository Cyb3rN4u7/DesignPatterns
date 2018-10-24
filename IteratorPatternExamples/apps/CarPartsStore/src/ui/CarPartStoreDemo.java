package ui;

import model.Store;

public class CarPartStoreDemo {

    public static void main(String[] args) {
        Store carPartStore = new Store("Athens branch");
        carPartStore.showPartsAvailable();
    }
}
