//Student Name : Nawapong Sitaruno นายนวพงศ์ สิตะรุโณ
//Student ID : 6209650230
package no1;

public class Employee {
    private String fullName;
    private int age;
    private String department;
    private int performanceScore;

    public Employee(String fullName,int age,String department,int performanceScore) {
        this.fullName = fullName;
        this.age = age;
        this.department = department;
        this.performanceScore = performanceScore;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(int performanceScore) {
        this.performanceScore = performanceScore;
    }

    public void getMonthlyPayment() {
        System.out.printf("Monthly Payment : ");
    }
}
