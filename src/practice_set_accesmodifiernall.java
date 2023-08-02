class Cyllinder{
    private int radius;
    private int height;
    public Cyllinder(int radius,int height){
        this.height=height;
        this.radius=radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
     public double area(){
        double area =2*Math.PI*radius*(radius+height);
        return  area;
    }
    public double volume(){
        double volume = Math.PI*radius*radius*height;
        return volume;
    }
}
class Rectangle {
    private int length;
    private int breadth;
    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}
class Sphere{
    private int radius;

    public int getRadius() {
        return radius;
    }
    public Sphere(int radius) {
        this.radius = radius;
    }
    public double area(){
        double area = 4*Math.PI*radius*radius;
        return area;
    }
    public double volume(){
        double volume = (4*Math.PI*radius*radius*radius)/3;
        return volume;
    }
}
public class practice_set_accesmodifiernall {
    public static void main(String[] args) {
        //Problem 1
        Cyllinder nisyu = new Cyllinder(35,12);
//        nisyu.setHeight(12);
//        nisyu.setRadius(35);
        //Problem Two
//        System.out.println(nisyu.area());
//        System.out.println(nisyu.volume());
        // Problem three
//        Rectangle r = new Rectangle();
//        System.out.println(r.getBreadth());
//        System.out.println(r.getLength());
        // Problem 5 - 4 is already completed
        /*
        Sphere sc= new Sphere(81);
        System.out.println(sc.getRadius());
        System.out.println(sc.area());
        System.out.println(sc.volume());
         */
    }
}
