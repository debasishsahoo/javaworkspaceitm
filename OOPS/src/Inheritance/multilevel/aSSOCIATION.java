class Bank 
{ 
    private String name; 
    Bank(String name) 
    { 
            this.name = name; 
} 
    public String getBankName() 
    { 
        return this.name; 
    } 
} 
class Employee 
{ 
    private String name; 
    Employee(String name) 
    { 
        this.name = name; 
    } 
    public String getEmployeeName() 
    { 
        return this.name; 
    } 
} 

class Association 
{ 
    public static void main (String[] args) 
    { 
        Bank b = new Bank("Axis"); 
        Employee e = new Employee("Himanshi"); 
        System.out.println(e.getEmployeeName() + 
            " is an employee of " + b.getBankName()); 
    } 
}
