//Student Name : Nawapong Sitaruno นายนวพงศ์ สิตะรุโณ
//Student ID : 6209650230
package no2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ClassicPrimeGenerator implements PrimeNumberGenerator, ActionListener {
    private int round = 1;
    private int step = 0;
    private ArrayList<Integer> primes = new ArrayList<Integer>();
    @Override
    public ArrayList<Integer> generatePrimes(int n) {
        primes.add(2);
        int prime = 3;

        while(round < n) {
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(prime); i++) {
                if(prime % i == 0) {
                    prime++;
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                primes.add(prime);
                round++;
            } else {
                continue;
            }
            prime++;
        }
        return primes;
    }
    @Override
    public int getPrime(int n) {
        return primes.get(n);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.print(getPrime(step++)+" ");
    }
}
