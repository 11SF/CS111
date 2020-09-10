import java.util.Random;

public class Dice {
    Random ran = new Random();
    private int score;

    public Dice() {
        score =1;
    }
    public void roll() {
        score = ran.nextInt(6)+1;
    }
    public int getFace() {
        return score;
    }

    @Override
    public String toString() {
        return "F = "+score;
    }
}
