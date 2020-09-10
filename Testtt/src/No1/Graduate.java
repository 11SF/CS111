package No1;

public class Graduate extends Student{
    private String thesisTitle;

    public Graduate(String name,int id,double gpa,String thesisTitle) {
        super(name,id,gpa);
        this.thesisTitle = thesisTitle;
    }
    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }
    @Override
    public String toString() {
        return super.toString()+"ThesisTitle : "+thesisTitle;
    }
}
