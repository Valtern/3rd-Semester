public class Car {
    private String brand;
    private int costs;
    public Car(String brand, int costs) {
        this.brand = brand;
        this.costs = costs;
    }

    Car() {

    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getCosts() {
        return costs;
    }
    public void setCosts(int costs) {
        this.costs = costs;
    }

    public int driverCostCalculation (int days) {
        return costs * days;
    }
}
