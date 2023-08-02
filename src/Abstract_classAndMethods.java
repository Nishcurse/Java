import java.sql.SQLOutput;

abstract class Parent2{
    public Parent2(){
        System.out.println("I am Parent2 class constructor");
    }
    public void sayhello(){
        System.out.println("hello ji, How are you ?");
    }
    abstract void greet();
    abstract void greet2();
}
class child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning!!");
    }@Override
    public void greet2(){
        System.out.println("Good Afternoon!!");
    }

}
abstract class child3 extends Parent2{
    public void vh(){
        System.out.println("Good Evening!!");
    }
}
public class Abstract_classAndMethods {
    public static void main(String[] args) {
//        Parent2 p =new Parent2(); -- Throws an error
        child2 c = new child2();
//        child3 c3 =new child3(); -- Throws an error as its an abstract class

    }
}

