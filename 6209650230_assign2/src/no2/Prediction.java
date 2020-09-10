//Student Name : Nawapong Sitaruno �Ǿ��� �Ե����
//Student ID : 6209650230
package no2;

public class Prediction {
	
	Zodiac zod = new Zodiac();
	
	public void lovePercentage(String name1,String name2) {
		int percentage = 0;
		int []sumPoint1 = new int[5];
		int []sumPoint2 = new int[4];
		int []sumPoint3 = new int[3];
		int []sumPoint4 = new int[2];
		String temp = (name1+name2).toUpperCase();
	
		for(int i =0;i<temp.length();i++) {
			switch(temp.charAt(i)) {
			case 'L' :sumPoint1[0]++;
				break;
			case 'O' :sumPoint1[1]++;
				break;
			case 'V' :sumPoint1[2]++;
				break;
			case 'E' :sumPoint1[3]++;
				break;
			case 'S' :sumPoint1[4]++;
				break;
			}
		}
		
		for(int i=1;i<sumPoint1.length;i++) {
				sumPoint2[i-1]+=sumPoint1[i-1]+sumPoint1[i];
		}		
		for(int i=1;i<sumPoint2.length;i++) {

				sumPoint3[i-1]+=sumPoint2[i-1]+sumPoint2[i];
		}
		for(int i=1;i<sumPoint3.length;i++) {
				sumPoint4[i-1]+=sumPoint3[i-1]+sumPoint3[i];
		}
		if(sumPoint4[0]>=10||sumPoint4[1]>=10) {
			percentage = sumPoint4[0]+sumPoint4[1];
		}
		else {
			percentage = (sumPoint4[0]*10)+sumPoint4[1];
		}
		
		System.out.println("\t\tThe love percentage is: "+percentage+"%");
	}
	
	public void  zodiacCompat(int p1Day,int p1Month,int p2Day,int p2Month) {
		boolean ans=false;
		zod.getZodiacP1(p1Day,p1Month);
		String []unMatch = zod.getZodiacP1(p1Day,p1Month).split(",");
		for(int i = 0;i<unMatch.length;i++) {
			if(unMatch[i].equalsIgnoreCase(zod.getZodiacP2(p2Day,p2Month))) {
				ans = true;
				break;
			}
		}
		System.out.print("\t\tThe zodiac compatibility is: ");
		if(ans == false) {
			System.out.print("Good");
		}
		else {
			System.out.print("Bad");
		}
		System.out.println();
		ans = false;
	}
}

