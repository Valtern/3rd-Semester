public class Seat {
    private String number;
    private Passenger passenger;
    public Seat(String number) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public String info() {
        String info = "";
        info += "Number: " + number + "\n";
        if (passenger != null) {
            info += "Passenger: " + passenger.info() + "\n";
        }
        return info;
    }
}
