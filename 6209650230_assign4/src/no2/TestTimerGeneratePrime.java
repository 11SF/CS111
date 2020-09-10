//Student Name : Nawapong Sitaruno นายนวพงศ์ สิตะรุโณ
//Student ID : 6209650230
package no2;

public class TestTimerGeneratePrime {
    public static void main(String[] args) {
        System.out.println("Classic Prime Generator : ");
        Calculator.generatePrimeNumbers(new ClassicPrimeGenerator(), 37);
        System.out.println();
        System.out.println("MillsWright Prime Generator : ");
        Calculator.generatePrimeNumbers(new MillsWrightPrimeGenerator(),37);
    }
}
