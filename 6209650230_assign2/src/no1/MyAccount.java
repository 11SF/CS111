//Student Name : Nawapong Sitaruno ¹Ç¾§Èì ÊÔµÐÃØâ³
//Student ID : 6209650230
package no1;

import java.util.Random;
import java.util.Scanner;

public class MyAccount {
	private String firstName;
	private String lastName;
	private String accountNumber="";
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	MyAccountItem MyAccItem = new MyAccountItem();
	
	public MyAccount(int count) {
		super();
		for(int i = count; i>0; i--) {
			accountNumber += String.valueOf(ran.nextInt(10)); 
		
		}
	}
	public void newAccount() {
		System.out.print("Input your firstname : ");
		firstName = scan.nextLine();
		System.out.print("Input your lastname : ");
		lastName = scan.nextLine();
		System.out.println("Hi! "+firstName+" "+lastName+" "+"Account number "+accountNumber);
	}
	public void addIncome() {
		System.out.print("List name : ");
		MyAccItem.setReceiveName(scan.nextLine());
		System.out.print("Amount : ");
		MyAccItem.setReceiveItems(Double.valueOf(scan.nextLine()));
		MyAccItem.setReceiveDate();
		MyAccItem.disPlay_Receive(MyAccItem.getTotalListNoReceive());
		MyAccItem.listNoReceive();
	}
	public void addExpens() {
		System.out.print("List name : ");
		MyAccItem.setExpenseName(scan.nextLine());
		System.out.print("Amount : ");
		MyAccItem.setExpenseItems(Double.valueOf(scan.nextLine()));
		MyAccItem.setExpenseDate();
		MyAccItem.disPlay_Expense(MyAccItem.getTotalListNoExpense());
		MyAccItem.listNoExpense();
		
	}
	public void sumary() {
		
		System.out.println("Sum of Income  +"+MyAccItem.getSumReceive()+"  Sum of Expense  -"+MyAccItem.getSumExpense());
		if(MyAccItem.getSumary()>0) {
			System.out.println("Balance  +"+MyAccItem.getSumary());
		}
		else if(MyAccItem.getSumary()<0) {
			System.out.println("Owing  -"+MyAccItem.getSumary());
		}
		else {
			System.out.println("Out of money”  "+MyAccItem.getSumary());
		}
	}
	public void searchI() {
		String keyword;
		Boolean found;
		System.out.print("Enter keyword : ");
		keyword = scan.nextLine();
		for(int i=0; i<MyAccItem.getTotalListNoReceive(); i++) {
			found = MyAccItem.getReceiveName(i).toLowerCase().contains(keyword);
			if(found == true) {
				MyAccItem.disPlay_Receive(i);
			}
		}
	}
	public void searchE() {
		String keyword;
		Boolean found;
		System.out.print("Enter keyword : ");
		keyword = scan.nextLine();
		for(int i=0; i<MyAccItem.getTotalListNoExpense(); i++) {
			found = MyAccItem.getExpenseName(i).toLowerCase().contains(keyword);
			if(found == true) {
				MyAccItem.disPlay_Expense(i);
			}
		}
	}
}
