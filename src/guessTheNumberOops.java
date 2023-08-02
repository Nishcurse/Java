import java.util.Scanner;
import java.util.Random;
class game{
    String name;
    int pcinput;
    int attempts=0;
    boolean isCorrect = false;

    public game() {
        Random no = new Random();
        int pcinput = no.nextInt(100);
        this.pcinput = pcinput;
    }

    public int getT() {
        return attempts;
    }

    public void setT(int attempts) {
        this.attempts = attempts;
    }
    int r =attempts;

    void takeuserinput(){
        int score = attempts;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dear " + name + ",Kindly Enter your guess for the mystery number Attempt:"+attempts);
        int userinput = sc.nextInt();
        if(attempts>0) {
            if (userinput == pcinput) {
                System.out.printf("Congratulations,%s you won the game on your %d trial and your score is %d out of %d", name, attempts, score,r);
            } else if (userinput > pcinput) {
                System.out.println("the number is smaller than you think");
                attempts--;
                this.takeuserinput();
            } else {
                System.out.println("the number is larger than you think");
                attempts--;
                this.takeuserinput();
            }
        }else {
            System.out.println("You have Lost the Game \n //////////////BETTER LUCK NEXT TIME////////////////");
        }
    }
}
public class guessTheNumberOops {
    public static void main(String[] args) {
        /*Create a class Game, which allows a user to play "Guess the Number" game once.
        Game should have the following methods:
        Constructor to generate the random number
        takeUserInput() to take a user input of number
        isCorrectNumber() to detect whether the number entered by the user is true
        getter and setter for noOfGuesses
        Use properties such as noOfGuesses(int), etc to get this task done!
         */
        System.out.println("Welcome to the Guess the number game \n  Rules for the guess the number game :\n" +
                "1. You have to choose the integer number between 0-100\n" +
                "2. you have many chances to guess the number\n" +
                "3. after your each input you would be given a hint\n" +
                "4. Best Score is 100 the more number of trails the leser the score");
        System.out.print("Kindly Enter Your precious name:");
        game user = new game();
        Scanner v = new Scanner(System.in);
        user.name = v.nextLine();
        System.out.println("Enter the number of attempts you want to play for:");
        int r = v.nextInt();
        user.setT(r);
        user.takeuserinput();
    }
}
