package no1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Appliance> list = new ArrayList<Appliance>();
        list.add(new Television());
        list.add(new Television());
        list.add(new Fan());
        list.add(new Fan());

        for(Appliance a : list) {
            a.work();
        }
        for(Appliance a : list) {
            System.out.println(a.getInfo());
        }

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
