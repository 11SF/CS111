package no1;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name,double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double applyCovidPolicy() {
        if(salary<10000) {
            return 2000;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "“Employee\tName: ”"+getName()+ "“\tSalary: ”"+getSalary();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

