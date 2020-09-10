//Student Name : Nawapong Sitaruno ¹Ç¾§Èì ÊÔµÐÃØâ³
//Student ID : 6209650230
package no1;

import java.util.Scanner;

public class PersonalAccountingSoftware {
	Scanner scan = new Scanner(System.in);
	MyAccount myAcc = new MyAccount(10);
	MyAccountItem MyAccItem = new MyAccountItem();
	private String choice;
	public void start() {
		while(true) {
			System.out.println("Please select menu ");
			System.out.println("Key  I  for create new account");
			System.out.println("Key  N  for add income or expens");
			System.out.println("Key  F  for search income or expens");
			System.out.println("Key  C  for calculate balance");
			System.out.println("Key  X  for close programe");
			System.out.print(">");
			choice = scan.nextLine();
			
			if(choice.equalsIgnoreCase("i")) {
				myAcc.newAccount();
			}
			else if(choice.equalsIgnoreCase("n")) {
				System.out.println("Key  +  for add income");
				System.out.println("Key  -  for add expens");
				switch(scan.nextLine()) {
				case "+" : myAcc.addIncome(); 
					break;
				case "-" : myAcc.addExpens(); 
					break;
				default : System.out.println("Invalid Input");
				}
			}
			else if(choice.equalsIgnoreCase("f")) {
				System.out.println("Key  +  for search income");
				System.out.println("Key  -  for search expens");
				switch(scan.nextLine()) {
				case "+" : myAcc.searchI(); 
					break;
				case "-" : myAcc.searchE(); 
					break;
				default : System.out.println("Invalid Input");
				}
			}
			else if(choice.equalsIgnoreCase("c")) {
				myAcc.sumary();
			}
			else if(choice.equalsIgnoreCase("x")) {
				System.out.println();
				System.exit(0);
			} 
			else {
				System.out.println();
			}
		}
	}
}
