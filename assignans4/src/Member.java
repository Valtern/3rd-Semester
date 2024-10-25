public class Member {
    private String idKTP;
    private String Name;
    private double loanLimit;
    private double loanAmount;

    Member(String idKTP, String Name, float loanLimit) {
        this.idKTP = idKTP;
        this.Name = Name;
        this.loanLimit = loanLimit;
    }
    public String getName() {
        return Name;
    }
    public double getLoanLimit() {
        return loanLimit;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void borrow(double borrowedAmount) {
        if (borrowedAmount+this.loanAmount > loanLimit) {
            System.out.println("Cannot get more loan");
        } else {
            if (borrowedAmount > loanLimit) {
                System.out.println("Unable to get loan more than the limit");
            } else if (loanLimReached()) {
                loanAmount += borrowedAmount;
            }
        }
    }

    public void installments(double installmentAmount) {
        if (installmentAmount < loanAmount * 0.1) {
            System.out.println("Cannot install less than " + loanAmount * 0.1);
        } else {
            loanAmount -= installmentAmount;
        }
    }

    public boolean loanLimReached() {
        if (loanAmount >= loanLimit) {
            System.out.println("Cannot get more loans");
            return false;
        } else {
            System.out.println("Loan acquired !");
            return true;
        }
    }
}
