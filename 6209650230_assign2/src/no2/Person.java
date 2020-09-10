//Student Name : Nawapong Sitaruno �Ǿ��� �Ե����
//Student ID : 6209650230
package no2;

import java.util.Calendar;
import java.util.Scanner;

public class Person {
	private String name;
	private String lastName;
	private int birthDay;
	private int birthMonth;
	private int birthYear;
	int currentYear = (Calendar.getInstance().get(Calendar.YEAR))-543;
	
	Scanner scan = new Scanner(System.in);
	public Person(String n) {
		String []information = n.split(";");
		String []fullName = information[0].split(" ");
		name = fullName[0];
		lastName = fullName[1];
		String[] birthday = information[1].split("/");
		birthDay = Integer.valueOf(birthday[0]);
		birthMonth = Integer.valueOf(birthday[1]);
		birthYear = Integer.valueOf(birthday[2]);
	}
	public String getName() {
		return name;
	}
	public String getLastName() {
		return lastName;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public int getAge() {
		return currentYear-birthYear;
	}
	public String getBirthDateBE() {
		return String.valueOf(birthDay)+"/"+String.valueOf(birthMonth)+"/"+String.valueOf(birthYear);
	}
}
