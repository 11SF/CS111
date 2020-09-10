//Student name : Nawapong Sitaruno
//Student ID : 6209650230
package no2;

public class BotPlayer {
	private int alive;
	
	public BotPlayer(int alivePerRound) {
		this.alive = alivePerRound;
	}
	public void setAlive() {
		this.alive -= 1;
	}
	public int getAlive() {
		return this.alive;
	}
}
