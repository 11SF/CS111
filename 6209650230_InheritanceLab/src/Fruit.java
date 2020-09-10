//Student Name : Nawapong Sitaruno นายนวพงศ์ สิตะรุโณ
//Student ID : 6209650230
public class Fruit extends Food{
    private String benefit;

    public Fruit(String name, double calories, String benefit) {
        super(name,calories);
        this.benefit = benefit;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }
    @Override
    public String getName() {
        return super.getName()+" ("+benefit+") ";
    }
}
