import java.util.Scanner;

//--> Problem 1
abstract class pen{
    abstract void write();
    abstract void refill();
}
//--> Problem 2
class fountainPen extends pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changenib(){
        System.out.println("Changing The Nib");
    }
}
class monkey {
    void jump(){
        System.out.println("Jumping....");
    }
    void bite(){
        System.out.println("biting....");
    }
}
interface BasicAnimalCharacter{
    void eat();
    void Sleep();
}
class Human extends monkey implements BasicAnimalCharacter{
    @Override
    public void eat() {
        System.out.println("Eating");
    }
    @Override
    public void Sleep() {
        System.out.println("Sleeping");
    }
    public void Speak() {
        System.out.println("Speaking");
    }
}
abstract class MyTelephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class Smart_Telephone extends MyTelephone{
    @Override
    void disconnect() {
        System.out.println("Disconnecting xxxxxxx ");
    }
    @Override
    void lift() {
        System.out.println("Lifting the Call^^^^");
    }
    void ring() {
        System.out.println("Ringing.......");
    }
    void ConnectToWifi() {
        System.out.println("Connected to InterSpace");
    }
    void GoogleAssistance() {
        System.out.println("Hey Nishu, Say What you searching for");
    }
}
interface TvRemote{
    void setVolume (int a);
    void channelchange (int channelno);
}
interface SmartTvRemote extends TvRemote{
    void VoiceSearch () ;
    void Connectonetwork () ;
}
class tv implements SmartTvRemote {
    int volume;
    int Channelno;
    Scanner tv = new Scanner(System.in);
    @Override
    public void setVolume(int a) {
        System.out.println("the volume is set to "+ a);
        volume=a;
    }
    @Override
    public void channelchange(int channelno) {
        System.out.println("Playing Channel no.:" + channelno);
        Channelno = channelno;
    }
    @Override
    public void VoiceSearch() {
        System.out.println("Try Saying whats on your mind!");
    }
    @Override
    public void Connectonetwork() {
        System.out.println("Connecting to The InterSpace 5GHZ");
    }

    public int getVolume() {
        return volume;
    }

    public int getChannelno() {
        return Channelno;
    }
}
public class Practice_set_abstractInterface {
    public static void main(String[] args) {
        // -->Question 1 & 2
        fountainPen pen = new fountainPen();
        pen.write();
        Human naresh = new Human();
        naresh.Sleep();
        // Question 5
        monkey chirag = new Human();
//        chirag.speak();--> Can't Speak as Chirag is not Human
        // But Chirag can --> Jump and Bite
        chirag.bite();
        chirag.jump();
        BasicAnimalCharacter badal = new Human();
        // Similarly badal can't talk but can eat and sleep
        badal.eat();
        badal.Sleep();
        //Question 6 - Explaining Polymorphism with Phones
        MyTelephone nokia = new Smart_Telephone();
        nokia.disconnect();
        nokia.lift();// Nokia can run all the methods of Telephone
        nokia.ring();
//        nokia.connecttowifi(); --> But can't run the Smart_telephone specific  Methods
        // Hence , The smart_TelePhone works as normal telephone
        tv samsong = new tv();
        samsong.channelchange(987);
        samsong.setVolume(100);
        samsong.getChannelno();
        samsong.getVolume();
    }
}
