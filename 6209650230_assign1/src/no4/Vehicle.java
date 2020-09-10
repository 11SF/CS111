//Student ID : 6209650230
//Name : Nawapong Sitaruno

package no4;

public class Vehicle {
	private double distance;
	private double efficiency;
	
	public void setDistance(double n) {
		distance = n;
	}
	public double getDistance() {
		return distance;
	}
	public void setEfficiency(double n) {
		efficiency = n;
	}
	public double getEfficiency() {
		return efficiency;
	}
	
	public double getConsumptionPerYear() {
		return distance/efficiency;
	}
	
	public double getConsumption(double range) {
		return range/efficiency;
	}
	public double getCO2EmissionPerKm() {
		return 2392.5/efficiency;
	}
	public double getCO2Emission() {
		return getCO2EmissionPerKm()*distance/Math.pow(10, 6);
	}
}
