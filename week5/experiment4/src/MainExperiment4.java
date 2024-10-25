public class MainExperiment4 {
    public static void main(String[] args) {
        Passenger p = new Passenger("12345", "Mr. Krab");
        Passenger budi = new Passenger("6789", "Mr. Budi");
        Carriage carriage = new Carriage("A", 10);
        carriage.setPassenger(budi, 1);
        carriage.setPassenger(p, 1);
        carriage.setPassenger(p, 2);
        System.out.println(carriage.info());
    }
}