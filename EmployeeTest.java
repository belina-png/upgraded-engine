import java.util.Scanner;

class Employee {            // DO NOT modify this class
    private int ID;         // 4-digit integer
    private String name;
    
    Employee(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    
    public int getID() {
        return ID;
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        return ID + " " + name;
    }
}

class FTstaff extends Employee {
    // Complete the subclass with a new field (salary), a constructor and override toString()
    private int salary;
    public FTstaff(int ID, String name,int salary){
        super(ID,name);
        this.salary=salary;
    }
    
    public String toString() {
        return super.toString() + " (FT) $"+ salary;
    }
}

class PTstaff extends Employee {
    // Complete the subclass with two new fields (hourly rate and working hours), a constructor and override toString()
    private int hourlyRate;
    private int workingHours;
    
    public PTstaff(int ID, String name,int hourlyRate,int workingHours){
        super(ID,name);
        this.hourlyRate=hourlyRate;
        this.workingHours=workingHours;
    }


public String toString() {
        return super.toString() + " (PT) $" + hourlyRate + " x " + workingHours;
    }
}

public class EmployeeTest {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        input.nextLine();
       
        Employee[] staff = new Employee[num];
        
        for (int i=0; i<num; i++) {
            int id = input.nextInt();
            String name = input.next();
            int mode = input.nextInt(); // 1: full time and 2: part time
            
            // Create either FTstaff or PTstaff and put into the array staff (3 lines)
            if(mode==1)
                staff[i]=new FTstaff(id,name,input.nextInt());
            else       
                staff[i]=new PTstaff(id,name,input.nextInt(),input.nextInt());
        }
       
        for (Employee e: staff) {
            // add one line to print full-time staff only
            if(e instanceof FTstaff)
                System.out.println(e);
        }        
        
        for (Employee e: staff) {
            // add one line to print part-time staff only
            if(e instanceof PTstaff)
                System.out.println(e);
        }
    }
}

