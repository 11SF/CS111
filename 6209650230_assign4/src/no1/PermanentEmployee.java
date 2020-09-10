//Student Name : Nawapong Sitaruno นายนวพงศ์ สิตะรุโณ
//Student ID : 6209650230
package no1;

import no1.Employee;

public class PermanentEmployee extends Employee {
    private float salary;
    private float socialSecurityRemittance;

    public PermanentEmployee(String fullName,int age,String department,int performanceScore,int salary) {
        super(fullName,age,department,performanceScore);
        this.salary =salary;
        socialSecurityRemittance = salary*(float)(0.05);
        if(socialSecurityRemittance > 750) {
            socialSecurityRemittance = 750;
        }
    }
    public void getMonthlyPayment() {
        super.getMonthlyPayment();
        if(super.getPerformanceScore()<8) {
            System.out.printf("%.2f Baht\t\tSocial Security : %.2f Baht",salary - socialSecurityRemittance,getSocialSecurityRemittance());
        } else {
            System.out.printf("%.2f Baht\t\tSocial Security : %.2f Baht",salary + (float)(salary*0.03)-socialSecurityRemittance,getSocialSecurityRemittance());
        }
    }

    public float getSalary() {
        return salary;
    }

    public float getSocialSecurityRemittance() {
        return socialSecurityRemittance;
    }
}
