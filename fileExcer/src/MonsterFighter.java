import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MonsterFighter {
    private ArrayList<Monster> monsterPools = new ArrayList<Monster>();
    private ArrayList<Monster> player1Mons = new ArrayList<Monster>();
    private ArrayList<Monster> player2Mons = new ArrayList<Monster>();

    public void loadMonster(String fileName) {
        File file = new File(fileName);
        try(Scanner fscan = new Scanner(file);) {
            while(fscan.hasNextLine())
                try {
                    monsterPools.add(new Monster(fscan.nextLine()));
                } catch(InvalidDataException e) {
                    System.out.println(e.getMessage());
                }
        }catch(FileNotFoundException fileNotFound) {
            System.out.println("Error : "+fileName+" can't found file");
        }
    }
    public void printMonster() {
        System.out.println("Player 1");
        for(Monster a: player1Mons) {
            System.out.println(a.toString());
        }
        System.out.println("Player 2");
        for(Monster a: player2Mons) {
            System.out.println(a.toString());
        }
    }
    public void autoPlay() {
        Random ran = new Random();
        player1Mons.add(monsterPools.get(ran.nextInt(monsterPools.size())));
        player1Mons.add(monsterPools.get(ran.nextInt(monsterPools.size())));
        player2Mons.add(monsterPools.get(ran.nextInt(monsterPools.size())));
        player2Mons.add(monsterPools.get(ran.nextInt(monsterPools.size())));
        System.out.println("----Start Auto Play----");
        printMonster();
        player1Mons.get(0).fight(player2Mons.get(0));
        player1Mons.get(1).fight(player2Mons.get(1));
        System.out.println("----After----");
        printMonster();

    }
}
