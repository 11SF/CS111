//Student Name : Nawapong Sitaruno �Ǿ��� �Ե����
//Student ID : 6209650230
package no2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name and birthdate in format: Name Lastname;dd/mm/yyyy");
		Person per1 = new Person(scan.nextLine());
		while(true) {
			System.out.println("Enter name and birthdate of your lover in format: Name Lastname;dd/mm/yyyy");
			Person per2 = new Person(scan.nextLine());
			Prediction pred = new Prediction();
			System.out.println("Calculate love compatibility between "+per1.getName()+" "+per1.getLastName()+" and "+per2.getName()+" "+per2.getLastName());
			pred.lovePercentage(per1.getName()+per1.getLastName(), per2.getName()+per2.getLastName());
			pred.zodiacCompat(per1.getBirthDay(),per1.getBirthMonth(),per2.getBirthDay(),per2.getBirthMonth());
			
			System.out.println("Want to calculate your love with another person? (Y/N)");
			if(scan.nextLine().equalsIgnoreCase("N")) {
				System.exit(0);
			}
			System.out.println("\n\n");
		}
	}
}
