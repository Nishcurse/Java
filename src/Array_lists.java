import java.util.*;
public class Array_lists {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        for (int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        ArrayList<String> issued_books = new ArrayList<>();
        issued_books.add("The encyclopedia");
        issued_books.add("A Song Of Ice And Fire");
        issued_books.add("The Alchemist ");
        issued_books.add("Charak Sahita ");
        issued_books.add("Valmiki Ramayana ");

    }
}
