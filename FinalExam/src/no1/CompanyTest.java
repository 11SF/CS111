package no1;

import java.util.ArrayList;

public class CompanyTest {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee e1 = new Employee("Mr. A", 8000); //พนักงานชื่อ Mr. A เงินเดือน 8,000 บาท
        Employee e2 = new Employee("Mr. B", 12000);
//พนักงานตำแหน่ง Programmer ชื่อ Mr. C เงินเดือน 20,000 บาท language ที่ถนัดคือ Java
        Programmer e3 = new Programmer("Mr. C", "Java", 20000);
        Programmer e4 = new Programmer("Miss D", "Python", 27000);
//พนักงานตำแหน่ง ProjectManager ชื่อ Miss E เงินเดือน 40,000 บาท
        ProjectManager e5 = new ProjectManager("Miss E", 40000);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
//สร้างบริษัท c1 ชื่อ Thailand Innovation Technology พร้อม list พนักงาน employees
        Company c1 = new Company("Thailand Innovation Technology", employees);
        String[] projects = {"TU WorkFromHome"};
//เพิ่มรายชื่อ Projects ที่พนักงาน e5 ดูแล
        e5.addNewProjects(projects);
        c1.printEmployeesDetail();
        double additionalBudget = Company.applyCovidPolicy(c1);
//แสดงยอดเงินที่บริษัทต้องจ่ายเพิ่ม หรือ ใช้ลดลง จากนโยบายช่วงโควิด
        System.out.println("“We need budget about: ”" + additionalBudget + "“ baht for covid crisis management.”"); //จากตัวอย่างแสดง We need budget about: -1000 baht for covid crisis management.

    }
}
