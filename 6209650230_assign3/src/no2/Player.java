//Student name : Nawapong Sitaruno
//Student ID : 6209650230
package no2;

public class Player {
	private int alive;
	
	public Player(int alivePerRound) {
		this.alive = alivePerRound;
	}
	public void setAlive() {
		this.alive -= 1;
	}
	public int getAlive() {
		return this.alive;
	}
}
