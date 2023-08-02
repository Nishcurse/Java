class Ccircle{
    int radius;
    public Ccircle(int radius) {
        System.out.println("I am a Cricle Constructor");
        this.radius = radius;
    }

    double area(){
        double a = Math.PI  * radius * radius;
        return a;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
class cCyllinder extends Ccircle{
    int height;
    @Override
    double area(){
        double a = 2*Math.PI*radius*(radius+height);
        return a;
    }
    public cCyllinder(int radius, int height) {
        super(radius);
        this.height = height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    double volume(){
        double a= Math.PI*radius*radius*height;
        return a;
    }
}
class Rrectangle {
    int lenght;
    int breadth;
    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public Rrectangle(int lenght,int breadth) {
        this.lenght = lenght;
        this.breadth= breadth;
    }

    public void setBreadh(int breadh) {
        this.breadth = breadth;
    }
    int area(){
        int a = lenght*breadth;
        return a;
    }
}
class Ccuboidial extends Rrectangle {
    int Height;
    public Ccuboidial(int lenght, int breadth, int height) {
        super(lenght, breadth);
        Height = height;
    }
    public void setHeight(int height) {
        Height = height;
    }
    int getVolume(){
        int a = lenght * breadth * Height ;
        return a;
    }
    @Override
    int area(){
        return 2*(lenght*breadth+breadth*Height+Height*lenght);
    }
}
public class pratice_set_modifier {
    public static void main(String[] args) {
        cCyllinder c = new cCyllinder(34,10);
        Ccuboidial r = new Ccuboidial(34,45,3);
        System.out.println(r.getVolume());
        System.out.println(r.area());
    }
}
