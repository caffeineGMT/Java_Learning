
public interface TaxCalculator {
  double calculateTax();

  static double getTaxabaleIncome(double income, double expenses) { // this static method should be avoided in interface
                                                                    // because interface should not have any
                                                                    // implementation details, it is just a contract

    return income - expenses;
  }
}
