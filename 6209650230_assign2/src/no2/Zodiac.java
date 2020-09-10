//Student Name : Nawapong Sitaruno �Ǿ��� �Ե����
//Student ID : 6209650230
package no2;

public class Zodiac {
	private String []zodiac = {"7,8","7,8,11","8,10,2","7,9","8,10","6,7,11","2,4,12","1,5","4,10","3,5,9","2,6,8","7"};
	public String getZodiacP1(int birthday,int birthMonth) {
		 birthMonth-=1;
		 
		 if(birthday<20) {
			 return zodiac[birthMonth];
		 }
		 else {
			 birthMonth+=1;
			 if(birthMonth>12) {
				 birthMonth = 1;
			 }
			 return zodiac[birthMonth];
		 }
	 }
	 public String getZodiacP2(int birthday,int birthMonth) {
		 
		 if(birthday<20) {
			 return String.valueOf(birthMonth);
		 }
		 else {
			 birthMonth+=1;
			 if(birthMonth>12) {
				 birthMonth = 1;
			 }
			 return String.valueOf(birthMonth);
		 }
	 }
}
