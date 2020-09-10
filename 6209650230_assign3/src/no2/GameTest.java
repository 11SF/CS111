//Student name : Nawapong Sitaruno
//Student ID : 6209650230
package no2;

import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Input Board Size(Square) : ");
		int boardSize = Integer.valueOf(scan.nextLine());
		System.out.print("Input Total Bombs(minimum 5) : ");
		int totalBomb = Integer.valueOf(scan.nextLine());
		while(true) {
			if(totalBomb<5) {
				System.out.print("Total bombs are minimum 5. Please try again. ");
				totalBomb = Integer.valueOf(scan.nextLine());
				continue;
			}
			break;
		}
		BombGame g1 = new BombGame(boardSize,totalBomb,3); //BoardSize,TotalBomb,AlivePerRound
		g1.inGame();
	}

}
