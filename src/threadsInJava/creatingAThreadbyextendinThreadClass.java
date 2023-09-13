package threadsInJava;
// Creating Thread by Creating a Class By extending Thread(Java.Util) Class
class Thread1 extends Thread {
    @Override
    public void run(){
        int t = 0;
        while(t<40000){
            System.out.println("Thread1 Studying is running");
            System.out.println("I am sad");
            t++;
        }
    }
}
class Thread2 extends Thread {
    @Override
    public void run(){
        int t = 0;
        while(t<40000){
            System.out.println("Thread2 Chatting with her is running");
            System.out.println("I am Happy!");
            t++;
        }
    }
}
public class creatingAThreadbyextendinThreadClass {
    public static void main(String[] args) {
        Thread1 t1 =new Thread1();
        Thread2 t2 =new Thread2();
        t1.start();
        t2.start();
    }
}
