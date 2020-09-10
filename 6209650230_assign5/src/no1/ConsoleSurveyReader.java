//Student name : Nawapong Sitaruno
//Student ID : 6209650230
package no1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConsoleSurveyReader {
    private int[] answerScore = new int[4];
    private int count;

    public void processResults(String fileName) {
        File file = new File(fileName);
        try(Scanner scan = new Scanner(file)){
            while(scan.hasNextLine()) {
                switch(scan.nextLine()) {
                    case "PlayStation4" : answerScore[0]++; break;
                    case "Switch" : answerScore[1]++; break;
                    case "None" : answerScore[2]++; break;
                    case "Both" : answerScore[3]++; break;
                }
                count++;
            }
            System.out.println("Total answers = "+(count));
            System.out.println("Select PlayStation4 "+answerScore[0]+" answers = "+ (answerScore[0]/(double)count)*100 +" percent");
            System.out.println("Select Switch "+answerScore[1]+" answers = "+ (answerScore[1]/(double)count)*100.0 +" percent");
            System.out.println("Select None "+answerScore[2]+" answers = "+ (answerScore[2]/(double)count)*100.0 +" percent");
            System.out.println("Select Both "+answerScore[3]+" answers = "+ (answerScore[3]/(double)count)*100.0 +" percent");
        } catch (FileNotFoundException e) {
            System.out.println("File "+fileName+" does not exist");
        }

    }
}
