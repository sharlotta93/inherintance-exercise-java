package staff;

public abstract class Employee {

    private String name;
    private int ni;
    protected double salary;

    public Employee(String name, int ni, double salary) {
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != " ") {
            this.name = name;
        }
    }

    public int getNi() {
        return ni;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double raise) {
        if (raise > 0) {
            this.salary += raise;
        }
    }

    public double payBonus() {
        return this.salary / 100;
    }
}
