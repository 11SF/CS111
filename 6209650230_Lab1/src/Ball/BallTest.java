//Student name : นวพงศ์ สิตะรุโณ
//Student ID : 6209650230
package Ball;

import java.util.Scanner;

public class BallTest {
	public static void main(String[] args) {
		Ball b1 = new Ball();
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the radius of the ball ");
		b1.setRadius(scan.nextDouble());
		System.out.printf("The ball radius '%.2f' has surface area = %5.3f\n",b1.getRadius(),b1.getSurface());
		System.out.printf("The ball radius '%.2f' has volume = %5.3f",b1.getRadius(),b1.getVolume());
		
		
	}
}

