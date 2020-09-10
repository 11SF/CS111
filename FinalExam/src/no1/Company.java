package no1;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Employee> employees;

    public Company(String name, ArrayList<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public void printEmployeesDetail() {
        for(Employee em:employees) {
            System.out.println(em.toString());
        }
    }

    public static double applyCovidPolicy(Company a) {
        double sum = 0;
        System.out.println("“**** เงินช่วยเหลือพนักงาน และ เงินหักลด ในช่วงวิกฤตการณ์โควิด *****”");
        for(Employee em: a.getEmployees()) {
            System.out.println(em.toString());
            System.out.println();
            if(em instanceof ProjectManager) {
                System.out.println("“Salary Reduction: ”"+ em.applyCovidPolicy());

            } else if(em instanceof Programmer) {
                System.out.println("“Work From Home Expense: ”"+ em.applyCovidPolicy());
            } else {
                System.out.println("“Top up: ”"+ em.applyCovidPolicy());
            }
            System.out.println("“-----------------------”");
        }
        for(Employee em: a.getEmployees()) {
            sum+=em.applyCovidPolicy();
        }
        return sum;
    }

    public String getName() {
        return name;
    }
    public void addEmployees(ArrayList<Employee> employees) {
        for(Employee e : employees) {
            this.employees.add(e);
        }
    }

    public ArrayList<Employee> getEmployees() {
        return this.employees;
    }

}
