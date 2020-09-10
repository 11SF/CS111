package no1;

import java.util.ArrayList;

public class ProjectManager extends Employee {
    private ArrayList<String> projects = new ArrayList<String>();

    public ProjectManager(String name,double salary) {
        super(name,salary);
    }

    @Override
    public String toString() {
        return "Employee\tName: "+super.getName()+ "\tSalary: "+super.getSalary()+" Working Projects:"+projects.get(0);
    }

    @Override
    public double applyCovidPolicy() {
        if(super.getSalary()>35000 && projects.size()>0) {
            return (super.getSalary()*0.1*-1);
        } else
            return super.applyCovidPolicy();
    }

    public void addNewProjects(String[] projects) {
        for(int i =0; i<projects.length;i++) {
            this.projects.add(projects[i]);
        }
    }
}

