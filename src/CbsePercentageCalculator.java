import java.sql.SQLOutput;
import java.util.Scanner;
public class CbsePercentageCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to CBSE Percentage Calculaor");
        System.out.println("input your top 5 subject marks from which english is must");
        Scanner sc = new Scanner(System.in);
        System.out.println("Subject 1");
        byte a = sc.nextByte();
        System.out.println("subject 2");
        byte b = sc.nextByte();
        System.out.println("subject 3");
        byte c = sc.nextByte();
        System.out.println("Subject 4");
        byte d = sc.nextByte();
        System.out.println("Subject 5");
        byte e = sc.nextByte();
        int sum = a+b+c+d+e;
        float percentage = sum / 5f ;
        System.out.println("Congrats! you have recived: ");
        System.out.print(percentage);
        System.out.println("% percentage,better luck next time");
    }
}
