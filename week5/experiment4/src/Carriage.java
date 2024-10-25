public class Carriage {
    private String code;
    private Seat[] seatArray;

    Carriage(String code, int amount) {
        this.code = code;
        this.seatArray = new Seat[amount];
        this.seatInit();
    }
    private void seatInit() {
        for (int i = 0; i < seatArray.length; i++) {
            this.seatArray[i] = new Seat(String.valueOf(i + 1));
        }
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String info () {
        String info = "";
        info += "Code : " + code + "\n";
        for (Seat seat : seatArray) {
            info += seat.info();
        }
        return info;
    }
    public void setPassenger(Passenger passenger, int number) {
        if (this.seatArray[number-1].getPassenger() == null) {
            this.seatArray[number-1].setPassenger(passenger);
        } else {
            System.out.println(number + " is already occupied");
        }
    }
}
