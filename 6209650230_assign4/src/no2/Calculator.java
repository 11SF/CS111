//Student Name : Nawapong Sitaruno นายนวพงศ์ สิตะรุโณ
//Student ID : 6209650230
package no2;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calculator {
    public static ArrayList<Integer> generatePrimeNumbers (PrimeNumberGenerator generator, int n) {
        ArrayList<Integer> primes = generator.generatePrimes(n);

        Timer timer = new Timer(2000, (ActionListener)generator);
        timer.setRepeats(false);
            int round = 1;
            try {
                while (round <= n) {
                    timer.start();
                    do {
                        Thread.sleep(100);
                    } while (timer.isRunning());
                    round++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        return primes;
    }
}

