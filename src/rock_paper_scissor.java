import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissor {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock , Paper and Scissors");
//        rock = 0;
//        paper = 1;
//        scissors = 2;
        int a, b;
        a = 0;
        b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String You = sc.nextLine();
        System.out.println(" Enter your move by the following : \n 0=rock \n 1=paper \n 2=scissors");
        int input1 = sc.nextInt();
        Random ram = new Random();
        int input2 = ram.nextInt(3);
//        System.out.println(input2);
        if (input1 == 0 && input2 == 0) {
            System.out.println(You + "-Rock");
            System.out.println("kabutar - Rock");
            System.out.println("Full on Pathaer baazi");
            System.out.println("Draw");
            a = 0;
            b = 0;
        } else if (input2 == 1 && input1 == 1) {
            System.out.println(You + "-Paper");
            System.out.println("Kabutar - Paper");
            System.out.println("Yeh Bhi theek hai");
            System.out.println("Draw");
            a = 0;
            b = 0;
        } else if (input2 == 2 && input1 == 2) {
            System.out.println(You + "-scissor");
            System.out.println("Kabutar -scissor");
            System.out.println("Bharabari ki Takkar hai:");
            System.out.println("Draw");
            a = 0;
            b = 0;
        } else if (input1 == 0 && input2 == 1) {
            System.out.println(You+"-Rock");
            System.out.println("Kabutar-Paper");
            System.out.println("Stone's Grave is Covered by Paper Right here");
            System.out.println("kabutar wins");
            a = a;
            b = ++b;
        } else if (input1 == 1 && input2 == 0) {
            System.out.println(You + "-Paper");
            System.out.println("Kabutar - Rock");
            System.out.println("Stone's Grave is Covered by Paper Right here");
            System.out.println(You + " win");
            a = ++a;
            b = b;
        } else if (input1 == 0 && input2 == 2) {
            System.out.println(You+"-Rock");
            System.out.println("Kabutar - Scissor");
            System.out.println("Tuth gyi Kenchi");
            System.out.println("Kabutar wins");
            a = ++a;
            b = b;
        } else if (input1 == 2 && input2 == 0 ){
            System.out.println(You+"-Scissor");
            System.out.println("Kabutar - Rock");
            System.out.println("Tuth gyi Kenchi");
            System.out.println(You + " wins");
            a = a;
            b = ++b;
        }else if (input1==1 && input2==2 ) {
            System.out.println(You+"-Paper");
            System.out.println("Kabutar - Scissor");
            System.out.println("Kabutar Has smile on his face While Cutting you Down");
            System.out.println("Kabutar wins");
            a=++a  ;b=b  ;
        }else if (input1==2 && input2==1 ) {
            System.out.println(You+"Scissor");
            System.out.println("Kabutar - Paper");
            System.out.println("Well Rip Kabutar");
            System.out.println(You +" Wins");
            a=a  ;b=++b  ;
        }else {
            System.out.println("sahi input Daal Haramkour!");
        }
        System.out.println("score: " +You+"-" + b +":Kabutar-"+ a);
    }
}