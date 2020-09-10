//Student ID : 6209650230
//Name : Nawapong Sitaruno

package no3;


import java.util.GregorianCalendar;
import java.util.Scanner;

public class AdvertisementTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Advertisement ad = new Advertisement();
		GregorianCalendar calendar = new GregorianCalendar();

		
		System.out.printf("Enter your name :");
		ad.setName(scan.nextLine());
		System.out.printf("Enter your text : ");
		ad.setText(scan.nextLine());
		System.out.printf("Enter your tag : ");
		ad.setTag(scan.nextLine());
		System.out.printf("Enter your content : ");
		ad.setContent_1(scan.nextLine());
		System.out.printf("Enter your content : ");
		ad.setContent_2(scan.nextLine());
		
		scan.close();
		System.out.println(ad.getText());
		System.out.println(ad.getContent_1());
		System.out.println(ad.getContent_2());
		System.out.printf("\n");
		System.out.println("Tag: "+ad.getTag());
		System.out.println("By: "+ad.getName());
		System.out.printf("Date: %td %<tB %<tY",calendar);

	}
}

