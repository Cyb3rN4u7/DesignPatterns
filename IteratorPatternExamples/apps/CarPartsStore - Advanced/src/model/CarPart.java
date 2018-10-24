package model;

public class CarPart {
   private int id;
   private String name;
   private double price;

    public CarPart(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarPart{" +
                "\tid=" + id +
                "\t, name='" + name +
                "\t, price=" + price +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarPart part = (CarPart) o;

        return id == part.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
