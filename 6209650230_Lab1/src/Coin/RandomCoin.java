//Student name : นวพงศ์ สิตะรุโณ
//Student ID : 6209650230
package Coin;

import java.util.Random;

public class RandomCoin {
	Random ran = new Random();
	private int noOfHead;
	private int noOfTail;
	private int round;
	
	public void init() {
		noOfHead = 0;
		noOfTail = 0;
		round = 0;
	}
	public void random(int count) {
		for(int i=0;i<count;i++) {
			if(ran.nextInt(2)==0) {
				noOfHead +=1;
			} else {
				noOfTail +=1;
			}
			round++;
		}
	}
	public void displayRandomCoin() {
		System.out.printf("Total round: %d\n",round);
		System.out.printf("Total head: %d\n",noOfHead);
		System.out.printf("Total Tail: %d\n",noOfTail);
		System.out.printf("Propotion of head: %f\n",(double)noOfHead/round);
		System.out.printf("Propotion of Tail: %f\n",(double)noOfTail/round);
		System.out.println("------------------------------------------------");
		System.out.printf("\n");
	}
}
