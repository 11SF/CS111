//Student name : Nawapong Sitaruno
//Student ID : 6209650230
package no3;

public class ShoppingItem {
    private String name;
    private float pricePerUnit;
    private int count;

    public ShoppingItem(String itemInfo) {
        String []temp = new String[3];
        temp = itemInfo.split(";");
        this.name = temp[0];
        this.pricePerUnit = Float.valueOf(temp[1]);
        this.count = Integer.valueOf(temp[2]);

    }
    public float getTotalPrice() {
        return pricePerUnit*count;
    }
    public String getName() {
        return name;
    }
    public float getPricePerUnit() {
        return pricePerUnit;
    }
    public int getCount() {
        return count;
    }
    public String getMessage() {
        return name+"\tprice: "+pricePerUnit+"\tcount: "+count+" items";
    }
}
