class A{
    public int nishu(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am Methode 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am Method 2 of Class B");
    }
    public void meth3(){
        System.out.println("I am Method 3 of Class B");
    }
}
public class methode_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b= new B();
        b.meth2();

    }
}
