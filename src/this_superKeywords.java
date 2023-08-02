class ekclass{
    int a;
    ekclass(int a){
        this.a=a;
    }
    public int getA() {
        return a;
    }
    public int return1(){
        return 1;
    }
}
class doclass extends ekclass{
    doclass(int v){
        super(v);
        System.out.println("I am an Constructor");
    }
}
public class this_superKeywords {
    public static void main(String[] args) {
//        ekclass ek = new ekclass(67);
//        System.out.println(ek.getA());
        doclass dho = new doclass(4);
        System.out.println(dho.a);
    }
}
