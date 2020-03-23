package Staff.Management;

public class Director extends Manager{
    double budget;

    public Director(String name,String niNumber,double salary,String deptName, double budget){
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }

    public double payBonus(){
       double bonus = getSalary() * 0.02;
       return bonus;
    }
}
