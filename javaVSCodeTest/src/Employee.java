package src;

public class Employee {
    private String name = "unknow";
    private String department = "unknow";
    private String id = "unknow";
    private double salary = 0;
    private boolean workFormHome = false;

    public Employee(String name, String department, String id, double salary, boolean workFormHome) {
        this.name = name;
        this.department = department;
        this.id = id;
        this.salary = salary;
        this.workFormHome = workFormHome;
    }
    public Employee() {}

    public String getDepartment() {
        return department;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public boolean getWorkFormHome() {
        return workFormHome;
    }
}