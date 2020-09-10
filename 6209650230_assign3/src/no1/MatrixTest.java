//Student name : Nawapong Sitaruno
//Student ID : 6209650230
package no1;

public class MatrixTest {

	public static void main(String[] args) {
		Matrix m1 = new Matrix(3,3,true);
		Matrix m2 = new Matrix(2,4,true);
		Matrix m3 = new Matrix(2,3,true);
		Matrix m4 = new Matrix(3,2,true);
		System.out.println("-----------m1-----------");
		m1.printData();
		System.out.println("-----------m2-----------");
		m2.printData();
		System.out.println("-----------m1+m2-----------");
		Matrix m5 = m1.plus(m2);
		m5.printData();
		
		System.out.println("-----------m3-----------");
		m3.printData();
		System.out.println("-----------m4-----------");
		m4.printData();
		System.out.println("-----------m3*m4-----------");
		Matrix m6 = m3.multiply(m4);
		m6.printData();
		
		System.out.println("-----------m4t----------");
		Matrix m7 = m2.transpose();
		m7.printData();
		
		
	}

}
