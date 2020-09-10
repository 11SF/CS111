//Student name : Nawapong Sitaruno
//Student ID : 6209650230
package no4;

public class Cartoon implements  ListableItem {
    private int volumeNo;
    private  int dayRented;
    private float price;
    private String name;

    public Cartoon(String name,int volumeNo,int dayRented,float price) {
        this.name = name;
        this.volumeNo = volumeNo;
        this.dayRented = dayRented;
        this.price = price;
    }
    public int getVolumeNo() {
        return  volumeNo;
    }
    public int getDayRented() {
        return dayRented;
    }
    public float getPrice() {
        return price;
    }
    public String getMessage() {
        return name+" vol. "+volumeNo+"\tprice per day : "+(int)price/10+"\treturn for : "+dayRented+" days";
    }
    public int getCount() {
        return dayRented;
    }
    public float getTotalPrice() {
        return ((int)price/10)*dayRented;
    }
}
