//Student Name : Nawapong Sitaruno นายนวพงศ์ สิตะรุโณ
//Student ID : 6209650230
package no1;

import no1.Employee;

public class HourlyEmployee extends Employee {
    private int workingSessionsPerMonth;
    private final int WORKING_TIME = 8;
    private final float MIN_HOURLY_WAGE_RATE = 50;

    public HourlyEmployee(String fullName,int age,String department,int workingSessionsPerMonth,int performanceScore) {
        super(fullName,age,department,performanceScore);
        this.workingSessionsPerMonth = workingSessionsPerMonth;
    }
    public float calculatePersonalHourlyWage() {
        if(super.getPerformanceScore()<=5) {
            return MIN_HOURLY_WAGE_RATE;
        } else {
            return MIN_HOURLY_WAGE_RATE+(MIN_HOURLY_WAGE_RATE*(super.getPerformanceScore()*10 - MIN_HOURLY_WAGE_RATE)/(float)100);
        }
    }
    public void getMonthlyPayment() {
        super.getMonthlyPayment();
        System.out.printf("%.2f Baht",WORKING_TIME*calculatePersonalHourlyWage()*workingSessionsPerMonth);
    }

}
