class Phone{
    public void showtime(){
        System.out.println("Time is 9 pm");
    }
    public void on(){
        System.out.println("Turning on phone......");
    }
}
class Smartphone extends Phone{
    public void music(){
        System.out.println("Playing Jhalak Dikh Laja..");
    }
    public void on(){
        System.out.println("Turning On Smartphone....");
    }
}
public class dynamic_methode_dispatch {
    public static void main(String[] args) {
        Phone samsung = new Smartphone();// Allowed
        samsung.showtime();//Allowed
        samsung.on();// Allowed - Super mein hai
//        samsung.music();// not allowed - Super mein nhi hai
    }
}
