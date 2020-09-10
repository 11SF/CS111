//Student name : Nawapong Sitaruno
//Student ID : 6209650230
package no2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class StockTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        FileReader fR;
        
        while (true) {
            try {
                System.out.println("Please input file name :");
                fR = new FileReader(scan.nextLine());
                break;
            } catch (FileNotFoundException fileNotFound) {
                System.out.println(fileNotFound.getMessage());
                continue;
            }
        }
        
        StockRecord sR = new StockRecord();
        
        for(int i = 0; i<fR.toArray().size(); i++) {
            try {
                sR.splitGroup(fR.toArray().get(i));
            } catch (InvalidDataException invalidData) {
                System.out.println(invalidData.getMessage());
            }
        }
        sR.recordToFile();
        scan.close();
    }
}
