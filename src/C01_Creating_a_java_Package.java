//import java.util.Scanner;
//import java.util.* ;
public class C01_Creating_a_java_Package {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("This is my Scanner");
        System.out.println("Enter any input");
        int a = sc.nextInt();
        System.out.println("The input user has given is : "+ a );
    }
}
