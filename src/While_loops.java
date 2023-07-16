import java.util.Scanner;
public class While_loops {
    public static void main(String[] args) {
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println("By Using Loops");
//        int i = 100;
//        while(i<=200){
//            System.out.println(i);
//            i++;
        // Do-While Loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value until which you want to print");
        int n = sc.nextInt();
        int b=1;
        do {
            System.out.println(b);
            b++;
        }while (b<=n);
    }
}

