//Student Name : Nawapong Sitaruno นายนวพงศ์ สิตะรุโณ
//Student ID : 6209650230
public class Food {
    private final int SERVING_SIZE = 100;
    private String name;
    private int serving;
    private double calories;

    public Food() {
        this.name = "";
        this.calories = 0;
    }
    public Food(String name,double calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServing() {
        return serving;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }

    public double getCalories() {
        return calories;
    }

    public double getTotalCalories() {
        return (calories/SERVING_SIZE)*serving;
    }
    @Override
    public String toString() {
        return getName() + " serving: "+ serving + " calories: "+ getTotalCalories();
    }
}
