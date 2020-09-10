//Student Name : Nawapong Sitaruno นายนวพงศ์ สิตะรุโณ
//Student ID : 6209650230
public class Yogurt extends Food{
    private String allergy;

    public Yogurt(double calories) {
        super("Yogurt",calories);
        this.allergy = "Lactose Intolerance";
    }
    public Yogurt(String name, double calorie, String allergy) {
        super(name,calorie);
        this.allergy = allergy;
    }
    public String getAllergy() {
        return allergy;
    }
    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }
    @Override
    public String toString() {
        return super.toString()+" Posible allergy: "+this.allergy;
    }
}
