package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Nawapong Sitaruno", "Web-develop", "135230", 56300, true);

        Scanner scan = new Scanner("employees.text");
        String data = scan.nextLine();

        System.out.println(data);
    }
}