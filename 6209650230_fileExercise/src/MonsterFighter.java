//Student Name : Nawapong Sitaruno นายนวพงศ์ สิตะรุโณ
//Student ID : 6209650230
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MonsterFighter {
	private ArrayList <Monster> monsterPools = new ArrayList<Monster>();
	private ArrayList <Monster> player1Mons = new ArrayList<Monster>();
	private ArrayList <Monster> player2Mons = new ArrayList<Monster>();
	Scanner scan = new Scanner(System.in);
	public void loadMonster(String fileName) {
		try {
			Scanner file = new Scanner(new FileReader(fileName));
			String data = scan.next();
			monsterPools.add(data.split("\n"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void printMonster() {
		
	}
	public void autoPlay() {
		
	}
}
