class myMainEmployee{
    private int id;
    private String name;
    public myMainEmployee(){
        id=1;
        name="Pankaj Tripathi";
    }
    public myMainEmployee(int a , String b){
        id = a;
        name = b;
    }
    public myMainEmployee(String n){
        id = 12;
        name = n;
    }
    public myMainEmployee(int a){
        id=a;
        name = "Seema Haider";
    }
     void setname(String n){
        name = n;
    }
     String getname(){
        return name;
    }
     int getid(){
        return id ;
    }
     void setid(int x){
        id = x;
    }
}
public class ConstructorsInJava {
    public static void main(String[] args) {
     myMainEmployee Nishu = new myMainEmployee(34,"Rani");
        System.out.println(Nishu.getid());
        System.out.println(Nishu.getname());
    }
}
