//Student name : นวพงศ์ สิตะรุโณ
//Student ID : 6209650230
package Coin;

import java.util.Scanner;

public class RandomCoinTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		RandomCoin coin = new RandomCoin();
		
		while(true) {
			System.out.println("Enter number of round: ");
			int count = Integer.valueOf(scan.nextLine());
			coin.random(count);
			coin.displayRandomCoin(); 
			System.out.println("Do you want to continue (y/n)? ");
			String cont = scan.nextLine();
			if(cont.equals("n")) {
				break;
			}
			System.out.println("Do you want to reset the previous round? (y/n) (default is no) ");
			String res = scan.nextLine();
			if(res.equals("y")) {
				coin.init();
			}
			
		}
	}
}
