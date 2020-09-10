import java.util.ArrayList;

public class DiceBox {
    ArrayList<Dice> dice = new ArrayList<Dice>();
    public DiceBox() {

    }
    public void add(Dice a) {
        dice.add(a);
    }
    public void shake() {
        for(Dice a: dice) {
            a.roll();
        }
    }
    public int getTotal() {
        int sum = 0;
        for(Dice a: dice) {
            sum += a.getFace();
        }
        return sum;
    }
    public void printDices() {
        for(int i =1; i<=dice.size();i++) {
            System.out.println(i+". Face = "+dice.get(i-1).getFace());
        }
    }
}
