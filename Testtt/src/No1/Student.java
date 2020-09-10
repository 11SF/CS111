package No1;

public class Student {
    private String name;
    private int id;
    private double gpa;

    public Student(String name,int id,double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Name : "+" ID : "+id+" GPA : "+gpa ;
    }
}
