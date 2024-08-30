package assignment;

public class MilitaryPlane extends Plane{
    private String capacity;
    private String cost;

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    public void setCost(String cost) {
        this.cost = cost;
    }

    public void getPlance () {
        super.getPlane();
        System.out.println("Capacity: " + capacity);
        System.out.println("Cost: " + cost);
    }

}
