//Student Name : Nawapong Sitaruno π«æß»Ï  ‘µ–√ÿ‚≥
//Student ID : 6209650230
package no1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyAccountItem {
	Date date = new Date();  
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  

	private int arrSize = 50;
	
	private int listNoReceive = 0;
	private double []receiveItems = new double[arrSize];
	private String []receiveName = new String[arrSize];
	private String []dateReceive = new String[arrSize];
	private double sum_receive = 0;
	
	private int listNoExpense = 0;
	private double []expenseItems = new double[arrSize];
	private String []expenseName = new String[arrSize];
	private String []dateExpense = new String[arrSize];
	private double sum_expense = 0;
	
	private double sumary;
	public void setReceiveItems(double n) {
		this.receiveItems[listNoReceive] = n;
		sum_receive+=n;
	}
	public void setReceiveName(String n) {
		this.receiveName[listNoReceive] = n;
	}

	public void listNoReceive() {
		listNoReceive++;
	}
	public void setReceiveDate() {
		dateReceive[listNoReceive] = formatter.format(date);
	}
	
	public void setExpenseItems(double n) {
		this.expenseItems[listNoExpense] = n;
		sum_expense+=n;
	}
	public void setExpenseName(String n) {
		this.expenseName[listNoExpense] = n;
	}
	public void setExpenseDate() {
		dateExpense[listNoExpense] = formatter.format(date);
	}
	public void listNoExpense() {
		listNoExpense++;
	}	
	public String getReceiveName(int i) {
		return receiveName[i];
	}
	public int getTotalListNoReceive() {
		return listNoReceive;
	}
	
	public String getExpenseName(int i) {
		return expenseName[i];
	}
	public int getTotalListNoExpense() {
		return listNoExpense;
	}
	
	public double getSumReceive() {
		return sum_receive;
	}
	public double getSumExpense() {
		return sum_expense;
	}
	
	public double getSumary() {
		sumary=sum_receive - sum_expense;
		return sumary;
	}
	public void disPlay_Receive(int i) {
		System.out.println();
		System.out.println(dateReceive[i]+"\t\t"+receiveName[i]+"\t\t"+"+"+receiveItems[i]);
	}
	public void disPlay_Expense(int i) {
		System.out.println();
		System.out.println(dateExpense[i]+"\t\t"+expenseName[i]+"\t\t"+"-"+expenseItems[i]);
	}
}
