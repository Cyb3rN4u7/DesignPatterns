package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Warehouse implements Iterable<CarPart> {
    private List<CarPart> carPartList;
    private String location;

    public Warehouse(String location){
        carPartList = new ArrayList<>();
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
            System.out.println("Removed : \n" + part);
            carPartList.remove(part);
        }
    }



    private boolean isContainsPart(CarPart part) {
        return carPartList.contains(part);
    }


    @Override
    public Iterator<CarPart> iterator() {
        return carPartList.iterator();
    }
}
