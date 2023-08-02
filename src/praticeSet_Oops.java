import java.util.Scanner;
//Problem 1
class karamchari{
    int id;
    int salary;
    String name;
    void getname(){
        System.out.println(" " + name);
    }
    void getsalary(){
        System.out.println(salary);
    }
    void setname(String new_name){
        System.out.printf("Employee with id %d has chaged to %s",id,new_name);
        name =new_name;
    }
}
class cellphone{
    void ringing(){
        System.out.println("ringing....");
    }
    void Vibrationg(){
        System.out.println("Vibrating.....");
    }
}
class square_kun{
    int side;
    int area(){
        int area=side*side;
        return area;
    }
    int perimeter(){
        int perimeter= 4*side;
        return perimeter;
    }
}
class rectangle{
    int lenght;
    int width;
    int area(){
        int area = lenght*width;
        return area;
    }
    int perimeter(){
        int peri = 2  *  ( lenght + width );
        return peri;
    }
}
class Rockstar_games{
    String name;
    void running(){
        System.out.println(name + " is Running");
    }
    void Hitting(){
        System.out.println(name + " is Hitting an npc");
    }
    void Firing(){
        System.out.println(name + " Firring over a teen");
    }
}
class Circle {
    int radius;
    void area(){
        float area= (float) (Math.PI*radius*radius);
        System.out.println(area);
    }
    void perimeter(){
        float perimeter = (float) (2*Math.PI*radius);
        System.out.println(perimeter);
    }
}

public class praticeSet_Oops {
    public static void main(String[] args) {
       /*karamchari Nishu = new karamchari();
       Nishu.id=1;
       Nishu.salary=89067;
       Nishu.name ="Utkarsh Mudagl";
       Nishu.setname("Rakesh ji");
       Nishu.getname();
        */
        // PROBLEM 2
        /*cellphone nishu = new cellphone();
        nishu.ringing();
        nishu.Vibrationg(); */
        // PROBLEM 3
        /*
        square_kun a = new square_kun();
        a.side=6;
        int area,perimeter;
        area = a.area();
        perimeter = a.perimeter();
        System.out.println(area);
        System.out.println(perimeter);
         */
        //PROBLEM 4
        /*
        rectangle nitya = new rectangle();
        nitya.width=5;
        nitya.lenght=6;
        int a=nitya.area();int b=nitya.perimeter();
        System.out.printf("%d,%d",a,b);
         */
        //Problem 5
        /*
        Rockstar_games tommy = new Rockstar_games();
        tommy.name="Tommy Vecetti";
        tommy.running();
        tommy.Hitting();
        tommy.Firing();
         */
        // Problem 6\
        /*Circle Ashu = new Circle();
        Ashu.radius=4;
        Ashu.area();
        Ashu.perimeter();
         */

    }
}