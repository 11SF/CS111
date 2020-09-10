//Student Name : Nawapong Sitaruno นายนวพงศ์ สิตะรุโณ
//Student ID : 6209650230
public class Monster {
	private String name;
	private int hp;
	private int atk;
	
	
	public Monster(String name,int hp,int atk) {
		try {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		} catch()
		
	}
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public int getAtk() {
		return atk;
	}
	
	public void toString() {
		System.out.println();
	}
	public void fight(Monster another) {
		this.hp -= another.atk;
		another.hp -= atk;
	}
	
	
}
