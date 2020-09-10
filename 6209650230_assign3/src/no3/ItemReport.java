//Student name : Nawapong Sitaruno
//Student ID : 6209650230
package no3;

import java.util.ArrayList;

public class ItemReport {
    private String header;
    ArrayList<ShoppingItem> shoppingItems = new ArrayList<ShoppingItem>();

    public ItemReport(String header) {
        this.header = header;
    }
    public void addAllItems(ShoppingItem[] items) {
        for(ShoppingItem temp : items) {
            shoppingItems.add(temp);
        }
    }
    public void addItems(ShoppingItem item) {
        shoppingItems.add(item);
    }
    public ArrayList<ShoppingItem> itemUnder(float price) {
        ArrayList<ShoppingItem> itemsUnder = new ArrayList<ShoppingItem>();
        for(ShoppingItem temp : shoppingItems) {
            if(temp.getPricePerUnit()<price) {
                itemsUnder.add(temp);
            }
        }
        System.out.println("Item under "+price+" baht are :");
        return itemsUnder;
    }
    public void printList() {
        int total_Items=0;
        int total_Count=0;
        int total_Price=0;
        System.out.println("----------"+header+"----------");
        for(ShoppingItem temp: shoppingItems) {
            System.out.println(temp.getName() +"\t price: "+temp.getPricePerUnit()+"\t count: "+temp.getCount()+" items");
        }
        System.out.println();
        for(ShoppingItem temp: shoppingItems) {
            total_Items = shoppingItems.size();
            total_Count+=temp.getCount();
            total_Price+=temp.getTotalPrice();
        }
        System.out.println("Total Item : "+total_Items);
        System.out.println("Total Item Count : "+total_Count+" prices");
        System.out.println("You need to pay : "+total_Price+" baht");
        System.out.println("\n------------------------------------");
    }
}
