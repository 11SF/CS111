public class Monster {
    private String name;
    private int hp;
    private int atk;

    public Monster(String data) throws InvalidDataException {
        String []temp = data.split(";");
        if(temp.length!=3) {
            throw new InvalidDataException("Invalid Data : "+data);
        }
        try {
            this.name = temp[0];
            this.hp = Integer.valueOf(temp[1].trim());
            this.atk = Integer.valueOf(temp[2].trim());
        } catch(Exception e) {
            throw new InvalidDataException("Invalid Data : "+data);
        }
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
    public String toString() {
        return "Name : "+name+"\tHP : "+hp+"\tAttack : "+atk;
    }
    public void fight(Monster another) {
        this.hp -= another.getAtk();
        another.hp -= this.atk;
        if(this.hp < 0) {
            this.hp = 0;
        }
        if(another.hp < 0) {
            another.hp = 0;
        }
    }


}
