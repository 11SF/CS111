//Student Name : Nawapong Sitaruno นายนวพงศ์ สิตะรุโณ
//Student ID : 6209650230
package no1;

import java.util.ArrayList;

public class EmployeeInheritanceTest {
    public static void main(String[] args) {
        ArrayList<Employee> person = new ArrayList<Employee>();
        person.add(new PermanentEmployee("Somchai-Hankla",25,"IT",8,20000));
        person.add(new PermanentEmployee("Somsong-Bunthum",22,"IT",4,12000));
        person.add(new HourlyEmployee("Manee-Deekum",21,"Production",25,6));
        person.add(new HourlyEmployee("Piti-Rukthai",25,"Production",30,5));
        person.add(new HourlyEmployee("Veera-Rukdee",30,"Production",20,8));
        printMonthlyPaymentSlip(person);
    }
    public static void printMonthlyPaymentSlip(ArrayList<Employee> p) {
        String[] name = new String[2];
        for(Employee i : p) {
            name = i.getFullName().split("-");
                System.out.printf("\n*************************************************\n");
                System.out.printf("\t\t\tPayment Slip of %s",i.getFullName().toUpperCase());
                System.out.printf("\n*************************************************\n");
                System.out.printf("First Name : %s\t\t\t\tLast Name : %s\n",name[0],name[1]);
                System.out.printf("Department : %s\t\t\tAge : %d\n",i.getDepartment(),i.getAge());
                i.getMonthlyPayment();
                System.out.println();
                System.out.println();
            }
        }
}

