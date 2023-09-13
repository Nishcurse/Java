package threadsInJava;
class MyThread1 implements Runnable {
    public void run() {
        int t = 321;
        while (t > 0) {
            System.out.println("I am a Thread11111111");
            t--;
        }
    }
}

    class MyThread2 implements Runnable {
        public void run() {
            int t = 312;
            while (t > 0) {
                System.out.println("I am a THreaD 2222222222222222222222");
                t--;
            }
        }
    }
public class threadsUsingRunnableInterface {

        public static void main(String[] args) {
            MyThread1 Bullet1 = new MyThread1();
            Thread gun1 = new Thread(Bullet1);
            MyThread2 Bullet2 = new MyThread2();
            Thread gun2 = new Thread(Bullet2);
            gun1.start();//These Threads Are Running Concurrently
            gun2.start();//These Threads Are Running Concurrently
        }

}
