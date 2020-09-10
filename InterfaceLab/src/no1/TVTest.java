//Student Name  : Nawapong Sitaruno
//Student ID    : 6209650230
package no1;

import no1.Appliance;
import no1.Television;

import java.util.ArrayList;

public class TVTest {
    public static void main(String[] args) {
        ArrayList<Appliance> list = new ArrayList<Appliance>();
        for(int i = 0; i< 4; i++) {
            list.add(new Television());
        }
        list.get(0).work();
        list.get(2).work();
        for(Appliance a : list) {
            if(a instanceof Television) {
            Television tv = (Television) a;
                tv.turnOff();
            }
        }
        for(Appliance a : list) {
            System.out.println(a.getInfo());
        }
    }
}
