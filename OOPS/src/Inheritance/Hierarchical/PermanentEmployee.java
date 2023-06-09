package Inheritance.Hierarchical;

class PermanentEmployee extends Employee{
    float incrementPercent;

    PermanentEmployee(){
        this.incrementPercent = 0.2f;
    }

    public static void main(String[] args) {
        TempEmployee tempEmployee = new TempEmployee();
        PermanentEmployee permanentEmployee = new PermanentEmployee();

        System.out.println("Total salary of Temporary Employee :: "+ ((tempEmployee.baseSalary * tempEmployee.incrementPercent) + tempEmployee.baseSalary));
        System.out.println("Total salary of Permanent Employee :: "+ ((permanentEmployee.baseSalary * permanentEmployee.incrementPercent) + permanentEmployee.baseSalary));
    }
}