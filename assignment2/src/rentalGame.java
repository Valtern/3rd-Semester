public class rentalGame {
    int gameID;
    String memberName, gameName;
    double amounttoPay;

    public void displayRentalDetails() {
        System.out.println("Rental Details");
        System.out.println("Member Name: " + memberName);
        System.out.println("Game Name: " + gameName);
        System.out.println("Amount to Pay: " + amounttoPay);
    }

    public double rentalAmount(int rentDays) {
        return amounttoPay * rentDays;
    }
}
