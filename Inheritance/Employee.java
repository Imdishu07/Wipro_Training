public class Employee extends Person {

    int nationalInsurance;
    int workStarted;
    double annualSalary;

    Employee(String name, int i, int workStarted,double annualSalary) {
        super(name);
        //TODO Auto-generated constructor stub
        this.nationalInsurance = i;
        this.workStarted = workStarted;
        this.annualSalary = annualSalary;
    }

    public int getnationalInsurance(){
        return nationalInsurance;
    }

    public int getworkStarted(){
        return workStarted;
    }

    public double getannualSalary(){
        return annualSalary;
    }
    
}
