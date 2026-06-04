package java_discussion10;



abstract class Employee {
    protected String name;
    protected int id;
    protected String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public abstract double calculatePay();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }
}


class FullTimeEmployee extends Employee {
    private double fixedSalary;

    public FullTimeEmployee(String name, int id, String department, double fixedSalary) {
        super(name, id, department);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculatePay() {
        return fixedSalary;
    }
}


class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, String department,
                            double hourlyRate, int hoursWorked) {
        super(name, id, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}


class ContractEmployee extends Employee {
    private String projectName;
    private double contractAmount;

    public ContractEmployee(String name, int id, String department,
                            String projectName, double contractAmount) {
        super(name, id, department);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculatePay() {
        return contractAmount;
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(
                "John", 101, "IT", 5000);

        Employee e2 = new PartTimeEmployee(
                "Alice", 102, "HR", 20, 80);

        Employee e3 = new ContractEmployee(
                "Bob", 103, "Development",
                "Website Project", 8000);

        Employee[] employees = {e1, e2, e3};

        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println("Pay = $" + emp.calculatePay());
            System.out.println("---------------------");
        }
    }
}