interface bicycle{
    int a=45;
    void applybreak(int decrement);
    void SpeedUP(int increment);
}
interface blowhorn{
    void blowhorn1();
    void blowhorn2();
}
class avonCycle implements bicycle,blowhorn {
    @Override
    public void blowhorn1() {
        System.out.println("Jalak Dikh La Ja pee pee pee...");
    }
    @Override
    public void blowhorn2() {
        System.out.println("Chal hatt bhen ki anmol po po po...");
    }
    @Override
    public void applybreak(int decrement) {
        System.out.println("Applying breaks");
        int speed = a -decrement;
        System.out.printf("Speed now is %d \n",speed);
    }
    @Override
    public void SpeedUP(int increment) {
        System.out.println("Accelerating the bicycle");
        int speed = a + increment;
        System.out.printf("Speed now is %d",speed);
    }
}
public class Interfaces {
    public static void main(String[] args) {
        avonCycle Atlas = new avonCycle();
        // You Can Create Properties in Interfaces
        System.out.println(Atlas.a);
        // You can not modify the Properties in Interface
        /*Atlas.a=34;*/
        Atlas.blowhorn1();
        Atlas.blowhorn2();
        Atlas.applybreak(23);
        Atlas.SpeedUP(45);
    }
}
