//Student name : Nawapong Sitaruno
//Student ID : 6209650230
package no2;

import java.util.Random;
import java.util.Scanner;

public class BombGame {
	private int alivePerRound;
	private int boardSize;
	private int row;
	private int col;
	private boolean [][]bombLocation;
	private String [][]board;
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	Player player;
	BotPlayer bot;
	
	public BombGame(int boardSize,int totalBomb,int alivePerRound) {
		this.alivePerRound = alivePerRound;
		this.boardSize = boardSize;
		this.bombLocation = new boolean[boardSize][boardSize];
		this.board = new String[boardSize][boardSize];
		this.player = new Player(alivePerRound);
		this.bot = new BotPlayer(alivePerRound);
		
		for(int i = 0; i<totalBomb; i++) {
			while(true) {
				int positionX = ran.nextInt(boardSize);
				int positionY = ran.nextInt(boardSize);
				if(bombLocation[positionX][positionY]) {
					continue;
				} else {
					bombLocation[positionX][positionY] = true;
					break;
				}
			}
		}
		for(int i = 0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				board[i][j] = "X";
			}
		}
	}
	
	public void inGame() {
		while(true) {
			while(true) {
				System.out.println("-------Player Turn-------");
				System.out.println("Input row");
				row = Integer.valueOf(scan.nextLine());
				System.out.println("Input col");
				col = Integer.valueOf(scan.nextLine());
				if(row>=this.boardSize||col>=this.boardSize) {
					System.out.println("Invalid row or column. Choose again");
					continue;
				}
				if(board[row][col].equals("-")||board[row][col].equals("b")) {
					System.out.println("Grid "+row+","+col+" is already opened. Choose again");
					continue;
				}
				System.out.println("Openning Grid "+row+" , "+col);
				if(checkPosition(row,col)) {
					player.setAlive();
					board[row][col] = "b";
				} else {
					board[row][col] = "-";
				}
				printBoard();
				printDetail();
				break;
			}
			if(player.getAlive()==0) {
				break;
			}
			while(true) {
				System.out.println("-------Computer Turn-------");
				row = ran.nextInt(boardSize);
				col = ran.nextInt(boardSize);
				if(board[row][col].equals("-")||board[row][col].equals("b")) {
					System.out.println("Grid "+row+","+col+" is already opened. Choose again");
					continue;
				}
				System.out.println("Openning Grid "+row+" , "+col);
				if(checkPosition(row,col)) {
					bot.setAlive();
					board[row][col] = "b";
				} else {
					board[row][col] = "-";
				}
				printBoard();
				printDetail();
				break;
			}
			if(bot.getAlive()==0) {
				break;
			}
		}
		
		System.out.println("\n------------Game ended. All Bombs Location are------------");
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[i].length;j++) {
				if(bombLocation[i][j]) {
					System.out.print("b\t");
				} else {
					System.out.print("-\t");
				}
			}
		System.out.println();
		}
	}
	private boolean checkPosition(int row,int col) {
		boolean ans = false;
			if(bombLocation[row][col]) {
				ans = true;
			}
		return ans;
	}
	
	private void printDetail() {
		System.out.println("Player Lefe : "+player.getAlive());
		System.out.println("Computer Lefe : "+bot.getAlive());
	}
	
	private void printBoard() {
		for(int i =0; i<board.length; i++) {
			for(int j = 0; j<board[i].length; j++) {
				System.out.print(board[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
}
