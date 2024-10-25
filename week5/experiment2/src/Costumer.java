public class Costumer {
    private String name;
    private Car car;
    private Driver driver;
    private int day;

    Costumer(String n, Car c, Driver d, int days) {
        name = n;
        car = c;
        day = days;
        driver = d;
    }

    Costumer() {

    }
    public String getName() {
        return name;
    }
    public Car getCar() {
        return car;
    }
    public Driver getDriver() {
        return driver;
    }
    public int getDay() {
        return day;
    }
    public void setCar(Car c) {
        car = c;
    }
    public void setDriver(Driver d) {
        driver = d;
    }
    public void setDay(int d) {
        day = d;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int totalCostCalculation() {
        return car.driverCostCalculation(day) + driver.driverCostCalculation(day);
    }
}
