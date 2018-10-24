package model;

public class Store {
    private String name;
    private Warehouse warehouse;

    public Store(String name){
        this.name = name;
        warehouse = new Warehouse(name);

        addParts();
    }



    public void showPartsAvailable(){
        System.out.println("\n\nHello customer! Welcome to Car Parts of "+ name +" our stock has :");
        for(CarPart part: warehouse){
            System.out.println(part);
        }
    }


    // Helpers
    private void addParts() {
        System.out.println("\nPopulating the Warehouse of " + name +" with cool parts...\n");
        warehouse.addPart(new CarPart(001,"Wheel",100));
        warehouse.addPart(new CarPart(051,"Wind Shield",180));
        warehouse.addPart(new CarPart(108,"Mirror",80));
        warehouse.addPart(new CarPart(110,"Electric Mirror",165));
        warehouse.addPart(new CarPart(554,"Fuses 10pcs ",20));
    }
}
