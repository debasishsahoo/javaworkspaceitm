package Inheritance.single;

public class Programmer extends Employee{

    float bonus;

    Programmer(){
        this.bonus = 2000;
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        
        float totalSalary = programmer.getTotalSalary(programmer.salary, programmer.bonus);
        System.out.println("Total salary for you programmer :: "+totalSalary);
    }

    float getTotalSalary(float basicSalary, float bonus){
        return basicSalary + bonus;
    }

}
