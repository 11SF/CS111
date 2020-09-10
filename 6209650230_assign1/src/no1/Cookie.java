//Student ID : 6209650230
//Name : Nawapong Sitaruno

package no1;

public class Cookie {
    private String name;
    private double price;
    public final double VAT = 0.07;
   
    public void setName(String aName) {
        name = aName;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double aPrice) {
        price = aPrice;
    }
   
    public double getPrice() {
        double value = price + getVat();
        return value;
    }
   
    private double getVat() {
        return price * VAT;
    }
   }