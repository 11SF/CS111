public class MonsTest {
    public static void main(String[] args) {
        MonsterFighter mf = new MonsterFighter();
        mf.loadMonster("data.txt");
        mf.autoPlay();
    }
}
