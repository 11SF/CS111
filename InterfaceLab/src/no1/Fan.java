package no1;

import java.util.Random;

public class Fan implements Appliance{
    Random ran = new Random();
    private int speed = 0;
    private boolean isOn;
    private boolean isSwing = false;
    public void work() {
        isOn = true;
        speed = ran.nextInt(3)+1;
    }
    public String getInfo() {
        if(isOn) {
            return "ON at speed "+speed;
        } else {
            return "OFF";
        }
    }
    public void swing() {
        isSwing = true;
    }
}
