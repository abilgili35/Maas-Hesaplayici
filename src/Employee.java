public class Employee{
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double taxRatio;
        if(this.salary < 1000)
        {
            taxRatio = 0;
        }
        else{
            taxRatio = 0.03;
        }
        return this.salary * taxRatio;
    }

    public double bonus(){
        double bonus=0;
        
        if(this.workHours > 40){
            bonus = 30 * (this.workHours - 40);
        }
        
        return bonus;
    }

    public double raiseSalary(){
        int workingYears = 2021 - this.hireYear;
        double salaryRaise = 0.0;

        if(workingYears < 10){
            salaryRaise = 0.05;
        }else if(workingYears > 9 && workingYears < 20){
            salaryRaise = 0.10;
        }else{
            salaryRaise = 0.15;
        }

        return this.salary * salaryRaise;
    }
    
    public String toString(){
        return "Adi\t\t\t:\t" + this.name + "\n" +
               "Maasi\t\t\t:\t" + this.salary + "\n" +
               "Calisma Saati\t\t\t:\t" + this.workHours + "\n" + 
               "Baslangic Yili\t\t\t:\t" + this.hireYear + "\n" + 
               "Vergi\t\t\t:\t" + this.tax() + "\n" + 
               "Bonus\t\t\t:\t" + this.bonus() + "\n" + 
               "Maas Artisi\t\t\t:\t" + this.raiseSalary() + "\n" + 
               "Vergi ve Bonuslar ile birlikte maas\t\t\t:\t" + (this.salary + this.bonus() - this.tax()) + "\n" +
               "Toplam Maas\t\t\t:\t" + (this.salary + this.raiseSalary());

    }
}