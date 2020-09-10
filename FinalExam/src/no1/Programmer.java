package no1;

public class Programmer extends Employee {
    private String language;
    public Programmer(String name,String language,double salary) {
        super(name,salary);
        this.language = language;
    }

    @Override
    public String toString() {
        return "“Employee\tName: ”"+super.getName()+ "“\tSalary: ”"+super.getSalary()+ "“Programming Language: ”"+this.language;
    }

    @Override
    public double applyCovidPolicy() {
        if(super.getSalary()<25000) {
            return super.applyCovidPolicy()+(super.getSalary()*0.05);
        } else
            return 0;
    }
}

