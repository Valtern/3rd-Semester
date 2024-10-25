public class testRental {
    public static void main(String[] args) {
        rentalGame rent = new rentalGame();
        rent.gameID = 1;
        rent.gameName =  "Call of cat";
        rent.memberName = "Meow";
        rent.amounttoPay = 25000;

        rent.displayRentalDetails();
        rent.amounttoPay = rent.rentalAmount(7);
        rent.displayRentalDetails();

    }
}