class MYcellphone2{
    void callno(int phonenumber){
        System.out.println("Calling a NUmber "+ phonenumber );
    }
    void pickcall(){
        System.out.println("Connecting.....");
    }
}
interface camera2{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("Good Morning Nishu");
    }
    default void record4k(){
        System.out.println("Recording in 4K...tik tik tik");
    }
}
interface wifi2{
    String[] getnetworks();
    void ConnectToANetwork(String a);
}
class Ssmartphone2 extends MYcellphone2 implements camera2,wifi2{
    @Override
    public void takesnap() {
        System.out.println("Taking a Snap");
    }
    @Override
    public void recordvideo() {
        System.out.println("Recording a Video");
    }
    //    @Override
//    public void record4k() {
//        System.out.println("Recording a 4k Video in Samsung While Taking Snap");
//    }
    @Override
    public String[] getnetworks() {
        System.out.println("Getting the list of available Networks");
        String[]networks={"InterSpace 2.4","Interspace 5GHz","Mi 11x pro"};
        return networks;
    }
    @Override
    public void ConnectToANetwork(String a) {
        System.out.println("connecting to" + a);
    }
    public void meht2(){
        System.out.println("Lala Rajpat rai");
    }
}
public class PolymorphismInInterface {
    public static void main(String[] args) {
        camera2 cam = new Ssmartphone2();//----> This is a Smartphone But Using it as a Camera
//        cam.getnetworks();----> Not Allowed as not an Camera2 Methode
//        cam.meth2();----> Not Allowed as not an Camera2 Methode
        cam.record4k();
        cam.recordvideo();
        Ssmartphone2 Samsong = new Ssmartphone2();
        Samsong.getnetworks();
        Samsong.meht2();
        Samsong.callno(352434556);
    }
}
