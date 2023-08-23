package calcu;
// Problem 1
import java.util.Scanner;
class calculator {
    public void normalcal(int a ,int b){
        System.out.println("sum:"+(a+b));
    }
}
class ScCalculator {
    public void sccalc(int a,int b){
        System.out.println("sin(a+B):"+Math.sin(a+b));
    }
}
class hybrid { 
    public void hybcalc(int a,int b){
        System.out.println("sum:"+(a+b));
        System.out.println("sin(a+B):"+Math.sin(a+b));
    }
}
public class problem1 {
    public static void main(String[] args) {
        System.out.println("I am  main methode");
        // Problem 2 ---> Warm up
        Scanner sc = new Scanner(System.in);
        System.out.println("input daal dale ");
        String input = sc.next();
        System.out.println("lelo Output");
    }
}
