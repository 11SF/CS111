//Student name : Nawapong Sitaruno
//Student ID : 6209650230
package no4;

public class Novel implements ListableItem{
    private String name;
    private int dayRented;

    public Novel(String name,int dayRented) {
        this.name = name;
        this.dayRented = dayRented;
    }
    public String getMessage() {
        return name+"\tprice per day : 7\treturn for : "+dayRented+" days";
    }
    public int getCount() {
        return dayRented;
    }
    public float getTotalPrice() {
        return 7*dayRented;
    }
    public String getName() {
        return name;
    }
    public int getDayRented() {
        return dayRented;
    }

}
