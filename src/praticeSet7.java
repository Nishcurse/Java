import jdk.dynalink.beans.StaticClass;

public class praticeSet7 {
    static void multiplication(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d times %d is %d \n", i, a, i * a);
        }
    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static int sum(int j) {
        int sum = 0;
        if (j == 0) {
            return 0;
        }
        sum += j + sum(j - 1);
        return sum;
    }

    static void patternReverse(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = x - i; j > 0; --j) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void average(int... arr) {
        int added = 0;
        for (int a : arr) {
            added += a;
        }
        float a = added;
        float result = a / arr.length;
        System.out.printf("the average of these elements would be:%f", result);
    }

    static void ctof(int n) {
        int fareh = (n * (9 / 5)) + 32;
        System.out.printf("%d in Fahrenheit would be %d", n, fareh);
    }

    static int fib(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    static void star(int n) {
        if (n > 0) {
            star(n-1);
            for (int i = n; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void star2(int n) {
        if(n>0) {
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }System.out.println();
            star2(n-1);
        }

    }


    public static void main(String[] args) {
        System.out.println("Welcome to the Methods Practice Sheet");
        // Problem 1 - Multiplication Table of n
        // multiplication(7);
        // Problem 2 - Pattern Star
//        pattern1(4);
        // Problem 3 - sum of first n natural number fy recursive methode formation
//        int c= sum(10);
//        System.out.println(c);
        //problem 4 - Reverse Star Pattern
//        patternReverse(6);
        // Problem 5 - finding the average of the number inputs
//        average(34,545,6556,7546,3453);
        // Problem 6
//        ctof(34);
        //Problem 7 - Finding nth term of fibonouchi sequence
//        int a = fib(24);
//        System.out.println(a);
        // Problem 8 - Problem 2 with recursive approach
//        star(4);
        // Problem 9 - Problem 3 with recursive approach
//        star2(4);
        // Problem 10 - Problem 3 with iterative approach

    }
}
