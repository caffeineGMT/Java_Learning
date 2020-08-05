import java.security.Principal;
import java.text.NumberFormat;

public class Morgage {
    private int principal;
    private float annualInterest;
    private byte years;

    public Morgage(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    private double calculateMortgage() {

        float monthlyInterest = this.annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        float numberOfPayments = this.years * Main.MONTHS_IN_YEAR;

        double mortgage = this.principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    public void printMortgage() {
        double mortgage = this.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

}