//Student name : นวพงศ์ สิตะรุโณ
//Student ID : 6209650230
package Ball;

public class Ball {
	private double radius;
	
	public void setRadius(double aRadius) {
		radius = aRadius;
	}
	public double getRadius() {
		return radius;
	}
	
	public double getSurface() {
		return 4*3.1416*(radius*radius);
	}
	public double getVolume() {
		return (4.0/3)*3.1416*(radius*radius*radius);
	}
}
