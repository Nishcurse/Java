import java.util.Arrays;

public class Variable_argument {
    static int sum(int x,int... arr) {
        // This will behave as int[]arr
        int sum = x;
        for (int a : arr) {
                sum += a;
            }
            return sum;
        }
        public static void main (String[]args) {
            System.out.println("Welcome to Var Args");
            System.out.println("the sum of Nothing is:" + sum(1,3,4,5,6));
            System.out.println("the sum of 4 and 5 is:" + sum(4, 5));
            System.out.println("the sum of 4,5 and 6 is:" + sum(4, 5, 6));
            System.out.println("the sum of 4,5,6 and 7 is:" + sum(4, 5, 7, 8));
        }
    }
