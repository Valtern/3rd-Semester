package assignment;

public class Earphone {
    private String model;
    private String color;
    private int price;
    private String name;

    public void setModel(String model) {
        this.model = model;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void getEarphone() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }
}
