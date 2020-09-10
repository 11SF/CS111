//Student ID : 6209650230
//Name : Nawapong Sitaruno

package no5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		double friction = 0;
		Scanner scan = new Scanner(System.in);
        Box b = new Box();
        SlopeFloor slope = new SlopeFloor();
            System.out.print("Enter box weight : ");
            b.setWeight(scan.nextDouble());
            System.out.print("Enter slope (degree) :");
            slope.setDegree(scan.nextDouble());
            System.out.print("Enter friction :");
            friction = scan.nextDouble();

			System.out.println("You need " + slope.getMinForce(b,friction) + " newtons of force to push the box up the ramp");
			scan.close();
	}

}
