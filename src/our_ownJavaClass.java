import java.security.PublicKey;

class Employee{
     int id;
     int Salary;
     String name;
     void printinfo(){
        System.out.println("MY id is " + id);
        System.out.println("My name is " + name);
         System.out.println(name+"'s Salary is " + Salary +" rupees per month");
    }
}
public class our_ownJavaClass {
    public static void main(String[] args) {
        System.out.print("Creating our own Java Class \n");
        Employee Nishu = new Employee();    // initialisation of new Object
        Employee Badal = new Employee();
        Nishu.id=86987;    // Setting Attributes for Nishu
        Nishu.name="Utkarsh Mudgal";
        Nishu.Salary=78957;
        Badal.id=34; // Setting Attributes for Badal
        Badal.name="Badal Sharma urf LMS";
        Badal.Salary=89067;
        Nishu.printinfo();
        Badal.printinfo();
    }
}
