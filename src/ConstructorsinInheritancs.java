import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

class base1 {
    base1(){
        System.out.println("I am a Base Class Constructor");
    }
    base1(int x){
        System.out.println("I am a Overloaded base constructor with int x as: " + x );
    }
}
class Derived1 extends base1{
    Derived1(){
        //super(0);
        System.out.println("I am a Dervied1 Class Constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.printf("I am an overloaded Derive1 Constructor with  y as %d \n",y);
    }
}
class childofDerived extends Derived1{
    childofDerived(){
        System.out.println("I am Child of Derived Class");
    }
    childofDerived(int x ,int y ,int z){
        super(x,y);
        System.out.println("This is the childofDerived class Overloaded Constructor with z as :"+z);
    }
}
public class ConstructorsinInheritancs {
    public static void main(String[] args) {
//        base1 b = new base1(23);
//        Derived1 d = new Derived1(34,56);
        childofDerived child = new childofDerived();
//        childofDerived child = new childofDerived(23,34,45);
    }
}
