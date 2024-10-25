public class MainExperiment2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setBrand("Avanza");
        c.setCosts(350000);
        Driver d = new Driver();
        d.setName("John Doe");
        d.setCosts(200000);
        Costumer cust = new Costumer();
        cust.setName("Jane Doe");
        cust.setCar(c);
        cust.setDriver(d);
        cust.setDay(2);
        System.out.println("Total cost: " + cust.totalCostCalculation());
        System.out.println(cust.getCar().getBrand());
    }
}