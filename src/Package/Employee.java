package Package;

public class Employee extends Person{

    private double daylySalary;

    public Employee(String name, int age, boolean isMan, double daylySalary) {
        super(name, age, isMan);
        this.daylySalary = daylySalary;
    }

    double overtimeWork(double hours) {
        if (this.getAge() > 18 && hours > 8.0) {
            double overtimeHours = hours - 8.0;
            double payment = this.daylySalary / 8.0 * 1.5 * overtimeHours;
            return payment;
        } else if (this.getAge() > 18 && hours <= 8.0) {
            System.out.println("There is no overtime detected.");
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public String toString() {
        double var10000 = this.daylySalary;
        return "Employee{daylySalary=" + var10000 + ", age=" + this.getAge() + ", isMan=" + this.isMan() + ", name='" + this.getName() + "'}";
    }

    void infoEmployee() {
        System.out.println(this.toString());
    }
}
