package No1;

public class Undergrad extends Student{
    
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString()+" Year : "+year;
    }
}
