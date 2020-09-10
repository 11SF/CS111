//Student Name  : Nawapong Sitaruno
//Student ID    : 6209650230
package no2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class IntegerLine implements ActionListener {
    ArrayList<Integer> intList = new ArrayList<Integer>();
    int step = 1;

        public void actionPerformed(ActionEvent e) {
            if(step%3 != 0) {
                Random ran = new Random();
                intList.add(ran.nextInt(100));
                System.out.print("Current left in line : ");
                for(int i : intList) {
                    System.out.print(i+ " ");
                }
                System.out.println();
            } else {
                int num = intList.remove(0);
                System.out.println("Remove: "+num);
            }
            step++;
        }
}
