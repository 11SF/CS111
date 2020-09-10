//Student Name : Nawapong Sitaruno 
//Student ID : 6209650230
package no3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ClassList {
		Random ran = new Random();
		FileWriter myWriter;
		private String filename="";
		private int numberOfStudents;
		private int[] numberOfStudentsWithGrade = new int[8];
		
		public ClassList(String filename, int numberOfStudents) {
			this.filename= filename;
			this.numberOfStudents = numberOfStudents;
			generateStudentRecordsToFile();
		}
		private void generateStudentRecordsToFile() {
			try {
			      FileWriter myWriter = new FileWriter(this.filename);
			      for(int i =0;i<this.numberOfStudents;i++) {
			    	int temp = 0;
					int tempScore = 0;
					String data = "";
			    	  for(int j = 0; j<10;j++) {
			    		  temp = ran.nextInt(10);
			    		  if(temp == 0) {
			    			  temp+=1;
			    		  }
			    		  data += String.valueOf(temp);
			    	  }
			    	  tempScore = ran.nextInt(101);
			      myWriter.write(data+"="+tempScore+";");
			    }
			      myWriter.close();
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			
		}
		public int countGrade(String grade,int lowerBound,int upperBound) {
			int show = 0;
			try {
				Scanner scan = new Scanner (new File(this.filename));
				String data = scan.next();
				String[] sItems = new String[this.numberOfStudents];
				sItems = data.split(";");
				String[] temp = new String[2];
				for(int i = 0;i<this.numberOfStudents;i++) {
					temp = sItems[i].split("=");
					int tempGrade = Integer.valueOf(temp[1]);
					if(tempGrade>=lowerBound&&tempGrade<=upperBound) {
						switch(grade) {
							case "A" : numberOfStudentsWithGrade[0]++; 
								break;
							case "B+" :numberOfStudentsWithGrade[1]++; 
								break;
							case "B" : numberOfStudentsWithGrade[2]++; 
								break;
							case "C+" :numberOfStudentsWithGrade[3]++; 
								break;
							case "C" : numberOfStudentsWithGrade[4]++; 
								break;
							case "D+" :numberOfStudentsWithGrade[5]++; 
								break;
							case "D" : numberOfStudentsWithGrade[6]++; 
								break;
							case "F" : numberOfStudentsWithGrade[7]++; 
								break;
						}
					}
				}
				scan.close();
			} catch(FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
			switch(grade) {
			case "A" : show = 0; break;
			case "B+": show = 1; break;
			case "B" : show = 2; break;
			case "C+": show = 3; break;
			case "C" : show = 4; break;
			case "D+": show = 5; break;
			case "D" : show = 6; break;
			case "F" : show = 7; break;
		}
			return numberOfStudentsWithGrade[show];
	}
}
		

