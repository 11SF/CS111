//Student ID : 6209650230
//Name : Nawapong Sitaruno

package no1;

public class CookieTest {
    public static void main(String[] args) {
        Cookie cookie1 = new Cookie();
        Cookie cookie2 = new Cookie();
        Cookie cookie3 = new Cookie();
        Cookie cookie4 = new Cookie(); 

        cookie1.setName("Chocolate Chip Cookie");
        cookie1.setPrice(15);

        cookie2.setName("Peanut Butter Cookie");
        cookie2.setPrice(12);

        cookie3.setName("Oatmeal Cookie");
        cookie3.setPrice(18);

        cookie4.setName("Oatmeal Resin Cookie");
        cookie4.setPrice(20);

        System.out.println(cookie1.getName()+"Price : "+cookie1.getPrice());
        System.out.println(cookie2.getName()+"Price : "+cookie2.getPrice());
        System.out.println(cookie3.getName()+"Price : "+cookie3.getPrice());
        System.out.println(cookie4.getName()+"Price : "+cookie4.getPrice());
    }
    
}