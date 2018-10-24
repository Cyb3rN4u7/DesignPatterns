package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Warehouse implements Iterable<CarPart> {
    private List<CarPart> carPartList;
    private List<CarPart> soldLog;
    private String location;

    public Warehouse(String location){
        carPartList = new ArrayList<>();
        soldLog = new ArrayList<>();
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void addPart(CarPart part){
        if(!isContainsPart(part)){
            System.out.println("Added : \n" + part);
            carPartList.add(part);
        }
    }

    public void removePart(CarPart part){
        if(isContainsPart(part)){
            System.out.println("Removing from stock : \n" + part);
            carPartList.remove(part);
        }
    }

    public void partSold(CarPart part) {
        removePart(part);
        System.out.println("\n\tSold: \t"+ part);
        soldLog.add(part);
    }



    private boolean isContainsPart(CarPart part) {
        return carPartList.contains(part);
    }


    @Override
    public Iterator<CarPart> iterator() {
        return new WarehouseIterator();
    }


    private class WarehouseIterator implements Iterator<CarPart> {
        // Here we put our cursors:
        Iterator<CarPart> partsInStockIterator = carPartList.iterator();
        Iterator<CarPart> soldPartsIterator = soldLog.iterator();


        @Override
        public boolean hasNext() {
            // if any of the iterators have next return it till there is no next
            return partsInStockIterator.hasNext()|| soldPartsIterator.hasNext();
        }

        @Override
        public CarPart next() {
            CarPart carPart;
            if(partsInStockIterator.hasNext()){
                System.out.print("Stocked : ");
                carPart = partsInStockIterator.next();
            }else {
                System.out.print("Sold : ");
                carPart = soldPartsIterator.next();
            }
            return carPart;
        }
    }
}
