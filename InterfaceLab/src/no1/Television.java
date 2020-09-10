//Student Name  : Nawapong Sitaruno
//Student ID    : 6209650230
package no1;

import no1.Appliance;

import java.util.Random;

public class Television implements Appliance {
    private int channel = 0;
    private boolean isOn;
    Random ran = new Random();

    public void work() {
        isOn = true;
        channel = ran.nextInt(10);
    }
    public String getInfo() {
        if(isOn) {
            return "ON at channel "+channel;
        } else {
            return "OFF";
        }
    }
    public void turnOff() {
        if(isOn) {
            isOn = false;
        }
    }
}
