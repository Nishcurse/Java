interface samplinterface{
    void meth1();
    void meth2();
}
interface childsampleinterface extends samplinterface{
    void meth3();
    void meth4();
}
class MysampleClass implements childsampleinterface{
    @Override
    public void meth1() {
        System.out.println("Nishu");
    }
    @Override
    public void meth3() {
        System.out.println("Badal");
    }
    @Override
    public void meth4() {
        System.out.println("Himanshu");
    }
    @Override
    public void meth2() {
        System.out.println("You");
    }
}
public class inhertiance_Interface {
    public static void main(String[] args) {
        MysampleClass obj = new MysampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
