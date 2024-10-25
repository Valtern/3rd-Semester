public class Driver {
    private String name;
    private int costs;

    Driver(String name, int costs) {
        this.name = name;
        this.costs = costs;
    }

    Driver() {

    }
    public String getName() {
        return name;
    }
    public int getCosts() {
        return costs;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCosts(int costs) {
        this.costs = costs;
    }

    public int driverCostCalculation(int day) {
        return costs * day;
    }
}
