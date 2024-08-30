package assignment;

public class Speaker {
    private String name;
    private String brand;
    private int price;

    public void setName (String name) {
        this.name = name;
    }
    public void setBrand (String brand) {
        this.brand = brand;
    }
    public void setPrice (int price) {
        this.price = price;
    }
    public void getSpeaker () {
        System.out.println("Speaker: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}
