//Student name : Nawapong Sitaruno
//Student ID : 6209650230
package no3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ShoppingListProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ItemReport _report = null;
        System.out.println("What is the name of this shopping list");
        _report = new ItemReport(scan.nextLine());
        while(true) {
            String userInput;
            printMenu();
            userInput = scan.nextLine();
            if(userInput.equalsIgnoreCase("l")) {
                while(true) {
                    try {
                        _report = new ItemReport();
                        System.out.println("Please input file name to load");
                        _report.loadReport(scan.nextLine());
                        break;
                    } catch(FileNotFoundException fileNotFound) {
                        System.out.println(fileNotFound.getMessage());
                    } catch (InvalidDataException fileUnFormat) {
                        System.out.println(fileUnFormat.getMessage());
                        System.exit(-1);
                    }
                }
            } else if(userInput.equalsIgnoreCase("a")) {
                try {
                    System.out.println("Please input data name;price;amount");
                    ShoppingItem shop_Item = new ShoppingItem(scan.nextLine());
                    _report.addItems(shop_Item);
                } catch (InvalidDataException invalidData) {
                    System.out.println(invalidData.getMessage());
                }
            } else if(userInput.equalsIgnoreCase("p")) {
                _report.printList();
            } else if(userInput.equalsIgnoreCase("s")) {
                System.out.println("Please input file name to save");
                try {
                    _report.saveReport(scan.nextLine());
                } catch (IOException ioEx) {
                    System.out.println("Error: can't create file");
                }
            } else if(userInput.equalsIgnoreCase("x")) {
                break;
            } else {
                System.out.println("Invalid input, Please try again");
            }
        }
        //scan.close();
    }
    public static void printMenu() {
        System.out.println("Select what you want to do:");
        System.out.println("Add item (a),Print list(p),Load list(l),Save list(s), Exit(x)");
    }
}
