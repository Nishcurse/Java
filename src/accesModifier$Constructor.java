class myemployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setid(int x){
        id = x;
    }
}
public class accesModifier$Constructor {
    public static void main(String[] args) {
        myemployee Nishu = new myemployee();
        // Will Give Error Due to private access in myemployee
//        Nishu.id=67;
//        Nishu.name="Utkarsh Mudgal";
        Nishu.setname("Utkarsh Mudgal");
        String a = Nishu.getName();
        Nishu.setid(34);
        int b = Nishu.getId();
        System.out.println(a);
        System.out.println(b);

    }
}
