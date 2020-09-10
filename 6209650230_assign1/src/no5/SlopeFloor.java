//Student ID : 6209650230
//Name : Nawapong Sitaruno

package no5;

public class SlopeFloor {
	private double degree;
	final double GRAVITY = 9.8;
	public void setDegree(Double degree) {
		this.degree = degree;
	}
	
	public double getMinForce(Box box,double friction) {
		return (box.getWeight()*GRAVITY*Math.sin(Math.toRadians(degree)))+(friction*box.getWeight()*GRAVITY*Math.cos(Math.toRadians(degree)));
	}
}
