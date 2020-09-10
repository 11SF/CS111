//Student Name : Nawapong Sitaruno นายนวพงศ์ สิตะรุโณ
//Student ID : 6209650230
import java.util.ArrayList;

public class DiaryDiet {
    private ArrayList<Food> diet;

    public DiaryDiet() {
        diet = new ArrayList<Food>();
    }
    public void add(Food food, int amount) {
        food.setServing(amount);
        diet.add(food);

    }
    public double getTotalCalories() {
        double totalCalories = 0;
        for(Food a : diet){
            totalCalories += a.getTotalCalories();
        }
        return  totalCalories;
    }
    public void printDietList() {
        for(Food a : diet) {
            System.out.println(a.toString());
        }
        System.out.println("Total calories : "+ this.getTotalCalories());
    }
}
