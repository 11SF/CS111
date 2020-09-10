//Student name : Nawapong Sitaruno
//Student ID : 6209650230
package no3;

public class ShoppingItem {
    private String name;
    private float pricePerUnit;
    private int count;

    public ShoppingItem(String itemInfo) throws InvalidDataException {
        String []temp = itemInfo.split(";");
        if(temp.length!=3) {
            throw new InvalidDataException("Data Incomplete : "+itemInfo);
        }
        this.name = temp[0];
        try {
            this.pricePerUnit = Float.valueOf(temp[1].trim());
            this.count = Integer.valueOf(temp[2]);
        } catch (Exception invalidType) {
            throw new InvalidDataException("Invalid Type : "+itemInfo);
        }
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
    @Override
    public String toString() {
        return name+";"+pricePerUnit+";"+count;
    }

}
