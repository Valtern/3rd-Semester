import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {

        boolean opt = true;
        int num = -1, cash = 0;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        df.setMaximumFractionDigits(340);

        Member donny = new Member("111333444", "Donny", 5000000);

        while (opt) {
            System.out.println("What would you like to do \n1. Borrow money \n2. Pay installments \n3. Print loan information \n4. Exit");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Enter how much money you would like to borrow");
                    cash = sc.nextInt();
                    donny.borrow(cash);
                    break;
                case 2:
                    System.out.println("Enter how much installment you would like to pay");
                    cash = sc.nextInt();
                    donny.installments(cash);
                    break;
                case 3:
                    System.out.println("Current loan amount: " + donny.getLoanAmount());
                    System.out.println("Loan limit " + donny.getLoanLimit());
                    break;
                case 4:
                    opt = false;
                    break;
            }
        }


    }
}