import java.sql.SQLOutput;
import java.util.Scanner;
public class CH05_Input {
    public static void main(String[] args) {
        System.out.println("Taking input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int b = sc.nextInt();
        System.out.println("Enter Numeber 2");
        int a = sc.nextInt();
        System.out.println("Product of these Two Number");
        System.out.println(a*b);
        System.out.println("Enter Your Feedback");
        String str =sc.nextLine();
        System.out.println("Is that your feedback");
        System.out.println(str);
    }
}
