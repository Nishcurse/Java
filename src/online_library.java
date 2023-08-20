import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;
interface liberarayFomrat {
    void list_books();
    void add_books(String...addbooks);
    void issue_books();
    void  returnbook();
        }class liberary implements liberarayFomrat{
    int id_number;
    String Customer_name;
    ArrayList<String> l1 = new ArrayList<>();
    String[]books={"1.The Alchemist","2.Half-Girlfriend","3.Global Ayurveda","4.Ramayana","5.Bhagavat Geeta"};
    
    public liberary(String customer_name, int id_number) {
        System.out.println("///////////////////////////////////////////////Welcome TO the Nishuuuu Liberary////////////////////////////////////////////////////////");
        Customer_name = customer_name;
        this.id_number = id_number;
        System.out.println("Dear,"+customer_name+" Hope you Have a nice Day!");
    }
    public int getId_number() {
        return id_number;
    }
    public String getCustomer_name() {
        return Customer_name;
    }
    @Override
    public void add_books(String...addbooks) {
        System.out.println("The Books being Added are:");
        System.out.println(addbooks.length);
        for (int i=0 ; i<addbooks.length ;i++) {
            int index = i+1;
            System.out.println(index +"."+ addbooks[i]);
        }
    }
    @Override
    public void issue_books() {
        list_books();
        System.out.println("Enter the index of the book you want to issue");
        Scanner sc = new Scanner(System.in);
        int rank = sc.nextInt();
        System.out.println( "Issuing the book ("+books[rank-1]+")");
        l1.add(books[rank-1]);
        System.out.println("What to issue Another Books 1--> Yes & Any Other integer-->No");
        int input = sc.nextInt();
        if (input==1){
            issue_books();
        } else {
            System.out.println("The Books You Have issued are : \n");
            for (int i =0;i<l1.size();i++){
                System.out.println( l1.get(i));
            }
        }
    }
    @Override
    public void returnbook() {
        System.out.println("The books you have Issued are :");
        for(int i =0;i<l1.size();i++){
            System.out.println( l1.get(i));
        }
        System.out.print("Enter the index of the book you Want to return to Nishuuu Library:");
        Scanner rb = new Scanner(System.in);
        int Reutrnindex = rb.nextInt();
        int mainindex = Reutrnindex-1;
        l1.remove(mainindex);
        System.out.println("The Books You have Right Now <3");
        for(int i =0;i<l1.size();i++){
            System.out.println( l1.get(i));
        }

    }
    @Override
    public void list_books(){
        System.out.println("Listing the books That can be Issued");
        for (String elements:books) {
            System.out.println(elements);
        }
    }
}
public class online_library {
    public static void main(String[] args) {
        liberary nishu = new liberary("Utkarsh Mudgal",1);
//        nishu.list_books();
        nishu.issue_books();
        nishu.returnbook();
    }
}
