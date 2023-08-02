class Base{
    int x;

    public Base(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("i am setting x in base class");
        this.x = x;
    }
    public void printme(){
        System.out.println("i am a construstor");
    }
}
class Derived extends Base{
    int y;
    public int getY() {
        return y;
    }

    public Derived(int x, int y) {
        super(x);
        this.y = y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Derived nishu = new Derived(34,54);
        System.out.println(nishu.getX());
    }
}
