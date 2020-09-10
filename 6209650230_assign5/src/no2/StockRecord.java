//Student name : Nawapong Sitaruno
//Student ID : 6209650230
package no2;

import java.io.*;
import java.util.ArrayList;

public class StockRecord {
    private ArrayList<String> availableData = new ArrayList<String>();
    private ArrayList<String> runoutData = new ArrayList<String>();

    public void splitGroup(String data) throws InvalidDataException {
        String[] temp = data.split(";");
        if(temp.length != 2) {
            throw new InvalidDataException("Invalid data : "+data);
        }
        try {
            if(Integer.valueOf(temp[1].trim()) > 0) {
                availableData.add(data);
            } else {
                runoutData.add(data);
            }
        } catch (Exception e) {
            throw new InvalidDataException("Invalid data : "+data);
        }

    }
    public void recordToFile() {
        try (
                FileWriter fwrite = new FileWriter("available.txt");
                PrintWriter pwrite = new PrintWriter(fwrite);
                ) {
            for(int i =0; i< availableData.size(); i++) {
                pwrite.println(availableData.get(i));
            }
        } catch(IOException fileNotFound_Write) {
            System.out.println("Error : can't write available data to file");
        }
        try (
                FileWriter fwrite = new FileWriter("runout.txt");
                PrintWriter pwrite = new PrintWriter(fwrite);
        ) {
            for(int i =0; i< runoutData.size(); i++) {
                pwrite.println(runoutData.get(i));
            }
        } catch(IOException fileNotFound_Write) {
            System.out.println("Error : can't write runout data to file");
        }
    }
}
