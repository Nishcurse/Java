public class methode_overloading {
    static void telljokes(){
        System.out.println("HEY,mohd. invented a new world \nplagiarism");
    }
    static void change2(int[]arr){
        arr[1]=69;
    }
    static int mathematics(int a) {
        a = a+10;
        return a;
    }
    static int mathematics(int a , int b){
        int c = (a+b)/2;
        return c;
    }
    static int mathematics(int a , int b , int c){
        int d =(a+b+c)/3;
        return d;
    }
    static  int change(int x){
        x=24;
        return x;
    }
    public static void main(String[] args) {
       // telljokes();
        // Changing the input
        /*
        int x =45;
        change(x);
        System.out.println("The value of x after the change is-"+ x);
         */
        // Changing the value of array
        /*int[]marks={70,89,78,98,88};
        change2(marks);
        System.out.println(marks[1]);
         */
        // Methode Overloading
        int a,b,c;
        a=mathematics(2);
        b=mathematics(2,3);
        c=mathematics(2,4,5);
        System.out.printf("the value of the following is %d and %d and %d",a,b,c);


    }
}
