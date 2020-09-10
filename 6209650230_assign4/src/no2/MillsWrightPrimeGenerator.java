//Student Name : Nawapong Sitaruno นายนวพงศ์ สิตะรุโณ
//Student ID : 6209650230
package no2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MillsWrightPrimeGenerator implements PrimeNumberGenerator , ActionListener{

    private int round = 0;
    private int step;
    private ArrayList<Integer> primes = new ArrayList<Integer>();
    @Override
    public ArrayList<Integer> generatePrimes(int n) {
        double fn_1 = 2.92005097731613471209256291711219;
        double fn;
        primes.add(2);
        round++;
        while(round < n) {

           fn = Math.floor(fn_1) * (fn_1 - Math.floor(fn_1) + 1);
           primes.add((int) Math.floor(fn));
           fn_1 = fn;
           round++;

        }
        return primes;
    }
    @Override
    public int getPrime(int n) {
        return primes.get(n);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.print(getPrime(step++)+ " ");
    }

}
