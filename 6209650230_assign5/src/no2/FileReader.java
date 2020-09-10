//Student name : Nawapong Sitaruno
//Student ID : 6209650230
package no2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    private File file;
    private ArrayList<String> data = new ArrayList<String>();
    public FileReader(String fileName) throws FileNotFoundException {
        file = new File(fileName);
        try(Scanner scan = new Scanner(file)) {
            while(scan.hasNextLine()) {
                data.add(scan.nextLine());
            }
        } catch (FileNotFoundException fileNotFound) {
            throw new FileNotFoundException("Error: File "+fileName+" does not exist.");
        }
    }
    public ArrayList<String> toArray() {
        return data;
    }

}
