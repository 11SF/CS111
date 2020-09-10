//Student ID : 6209650230
//Name : Nawapong Sitaruno

package no4;

import java.util.Scanner;

public class VehicleTest {
	public static void main(String[] args) {
		double range = 100;
		Scanner scan = new Scanner(System.in);
		Vehicle veh = new Vehicle();
		
		System.out.print("Enter your car's distance(km)/year: ");
		veh.setDistance(scan.nextDouble());
		System.out.print("Enter your car's efficiency (km/liter): ");
		veh.setEfficiency(scan.nextDouble());
		scan.close();
		
		System.out.println("Your car's profile:");
		System.out.println("Efficiency (km/l): "+veh.getEfficiency());
		System.out.println("Distance (km/year): "+veh.getDistance());
		System.out.println("Consumption for " +range +" km (liter): "+veh.getConsumption(range));
		System.out.println("Consumption per year (liter): "+veh.getConsumptionPerYear());
		System.out.println("CO2 emission (g/km): "+veh.getCO2EmissionPerKm());
		System.out.println("CO2 emission per year (tons): "+veh.getCO2Emission());
	}
}
