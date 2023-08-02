class MYcellphone{
    void callno(int phonenumber){
        System.out.println("Calling a NUmber "+ phonenumber );
    }
    void pickcall(){
        System.out.println("Connecting.....");
    }
}
interface camera{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("Good Morning Nishu");
    }
    default void record4k(){
        greet();
        System.out.println("Recording in 4K");
    }
}
interface wifi{
    String[] getnetworks();
    void ConnectToANetwork(String a);
}
class Ssmartphone extends cellphone implements camera,wifi{
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
}
public class Default_methods {
    public static void main(String[] args) {
        Ssmartphone sam = new Ssmartphone();
        String[]connections= sam.getnetworks();
        for (String elements:connections) {
            System.out.println(elements);
        }
        sam.record4k();
//        sam.greet(); // Throws an error as its Private methode
    }
}
