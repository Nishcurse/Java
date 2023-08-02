//episode 33
import java.util.Scanner;
public class recursion {
    static int factorial(int x){
        if(x==0 || x==1){
            return 1;
        }
        int c = 1 ;
        c = x * factorial(x-1);
        return c;
    }
    static int factorial_manually(int n){
        if(n==0){
            return 1;
        }
        int pro = 1;
        for(int i =1;i<=n;i++){
            pro *= i;
        }return pro;
    }
    public static void main(String[] args) {
        Scanner nishu =new Scanner(System.in);
        int n = nishu.nextInt();
        System.out.println("the factorial of n is :" + factorial(n) );
        System.out.println("the factorial of n is :"+ factorial_manually(n));
    }
}
