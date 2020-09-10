//Student name : Nawapong Sitaruno
//Student ID : 6209650230
package no4;


import java.util.ArrayList;

public class ItemReport2 {
    private String header;
    ArrayList<ListableItem> listItems = new ArrayList<ListableItem>();

    public ItemReport2(String header) {
        this.header = header;
    }
    public void addAllItems(ListableItem[] items) {
        for(ListableItem temp : items) {
            listItems.add(temp);
        }
    }
    public void addItem(ListableItem item) {
        listItems.add(item);
    }
    public ArrayList<ListableItem> itemUnder(float price) {
        ArrayList<ListableItem> itemsUnder = new ArrayList<ListableItem>();
        for(ListableItem temp : listItems) {
            if(temp.getTotalPrice()<price) {
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
        for(ListableItem temp: listItems) {
            System.out.println(temp.getMessage());
        }
        System.out.println();
        for(ListableItem temp: listItems) {
            total_Items = listItems.size();
            total_Count+=temp.getCount();
            total_Price+=temp.getTotalPrice();
        }
        System.out.println("Total Item : "+total_Items);
        System.out.println("Total Item Count : "+total_Count+" prices");
        System.out.println("You need to pay : "+total_Price+" baht");
        System.out.println("\n------------------------------------");
    }
}
