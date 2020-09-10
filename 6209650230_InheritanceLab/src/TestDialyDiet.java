//Student Name : Nawapong Sitaruno นายนวพงศ์ สิตะรุโณ
//Student ID : 6209650230
public class TestDialyDiet {
    public static void main(String[] args) {
        DiaryDiet diet = new DiaryDiet();
        diet.add(new Fruit("Banana", 89, "lowering blood pressure, improving heart health"), 250);
        diet.add(new Yogurt(127), 250);
        diet.add(new Yogurt("Low Fat ", 100, "Diarrhea"),400);
        diet.add(new Food("Pizza", 270), 300);
        diet.printDietList();
    }
}
