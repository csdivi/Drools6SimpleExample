package code.sample;

public class Action {

    Applicant applicant;
    public Action(Applicant applicant)
    {
        this.applicant = applicant;
    }
    
    public void doSomething()
    {
        System.out.println(applicant.getName() +" is not eligible");
    }
}
