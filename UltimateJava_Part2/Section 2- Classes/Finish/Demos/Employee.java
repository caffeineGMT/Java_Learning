// public class Employee {
//   private int baseSalary;
//   private int hourlyRate;

//   public static int numberOfEmployees;

//   public Employee(int baseSalary) {
//     this(baseSalary, 0);
//   }

//   public Employee(int baseSalary, int hourlyRate) {
//     setBaseSalary(baseSalary);
//     setHourlyRate(hourlyRate);
//     numberOfEmployees++;
//   }

//   public static void printNumberOfEmployees() {
//     System.out.println(numberOfEmployees);
//   }

//   public int calculateWage(int extraHours) {
//     return baseSalary + (getHourlyRate() * extraHours);
//   }

//   public int calculateWage() {
//     return calculateWage(0);
//   }

//   private void setBaseSalary(int baseSalary) {
//     if (baseSalary <= 0)
//       throw new IllegalArgumentException("Salary cannot be 0 or less.");
//     this.baseSalary = baseSalary;
//   }

//   private int getBaseSalary() {
//     return baseSalary;
//   }

//   private int getHourlyRate() {
//     return hourlyRate;
//   }

//   private void setHourlyRate(int hourlyRate) {
//     if (hourlyRate < 0)
//       throw new IllegalArgumentException("Hourly rate cannot be 0 or negative.");
//     this.hourlyRate = hourlyRate;
//   }
// }

// my solution
public class Employee {
  private int baseSalary;
  private int hourlyRate;
  private static int numberOfEmployees;

  public Employee(int baseSalary, int hourlyRate) {
    setBaseSalary(baseSalary);
    setHourlyRate(hourlyRate);
    numberOfEmployees++;
  }

  public Employee(int baseSalary) {
    // delegating the task to other constructors
    this(baseSalary, 0);
  }

  private int getBaseSalary() {
    return baseSalary;
  }

  private void setBaseSalary(int baseSalary) {
    // do data validation here
    // if (baseSalary >= 0) {
    // this.baseSalary = baseSalary;
    // }
    // the sanity check should throw an error
    if (baseSalary <= 0) {
      throw new IllegalArgumentException("illegal value");
    }
    this.baseSalary = baseSalary;
  }

  private int getHourlyRate() {
    return hourlyRate;
  }

  private void setHourlyRate(int hourlyRate) {
    // do data validation here
    if (hourlyRate >= 0) {
      this.hourlyRate = hourlyRate;
    }
  }

  public int calculateWage(int hours) {
    // shouldn't use private field directly
    // return this.baseSalary+this.hourlyRate*hours;
    return getHourlyRate() * hours + getBaseSalary();
  }

  public static int printNumberOfEmployees() {
    return numberOfEmployees;
  }
}
