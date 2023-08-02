import jdk.dynalink.beans.StaticClass;

public class java_methods {
     int mysum(int x , int y){
        int z;
        if(x>y){
            z=x+y;
        }else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        System.out.println("Methods in Java");
        int a,b,c;
        java_methods obj = new java_methods();
        a=5;b=7;
        c=obj.mysum(a,b);
        int a1,b1,c1;
        a1=2;b1=2;
        c1=obj.mysum(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
