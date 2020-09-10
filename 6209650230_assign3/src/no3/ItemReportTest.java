//Student name : Nawapong Sitaruno
//Student ID : 6209650230
package no3;

import java.util.Scanner;

public class ItemReportTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the name of this shopping list");
        ItemReport _report = new ItemReport(scan.nextLine());
        while(true) {
            String userInput;
            System.out.println("Add more items (name;price per unit;count) or exit (e)");
            userInput = scan.nextLine();
                if(userInput.equalsIgnoreCase("e")) {
                    break;
                }
            ShoppingItem shop_Item = new ShoppingItem(userInput);
                _report.addItems(shop_Item);
        }
        _report.printList();
        for(ShoppingItem temp: _report.itemUnder(20)) {
            System.out.println(temp.getName() +"\t price: "+temp.getPricePerUnit()+"\t count: "+temp.getCount()+" items");
        }
    }
}
