class c1{
    public int x =5; // Public Modifiers
    protected int y = 45;// Protected Modifiers
    int z = 7;// Default Modifier or no Modifiers
    private int a = 56; //Private Modifiers
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        c1 c = new c1();
        System.out.println(c.x);
        System.out.println(c.y);
//        System.out.println(c.a);
        System.out.println(c.z);
    }
}

