public class arrays {
    public static void main(String[] args) {
        // First Declaration Then Allocation
       /* int[]numbers;
        numbers = new int[5];
        //Initialisation
        numbers[0]=123;
        numbers[1]=23;
        numbers[2]=45;
        numbers[3]=56;
        numbers[4]=76;
        System.out.println(numbers[3]);
        */
        // Declaration & Allocation Together
       /* int[]marks=new int[4];
        marks[0]=23;
        marks[1]=454;
        marks[2]=65;
        marks[3]=564;
        System.out.println(marks[3]);
        */
        // Declaration and Initialisation in a single line
       /* float[]marks={23.4f,35.3f,45.0f,34.9f,56.5f,32.7f,65.5f};
       int[]marks={123,343,45,324,345};
        System.out.println(marks[4]);
        System.out.println(marks.length);
        System.out.println(names.length);
        System.out.println(names[4]);
        */
        String[]names={"nishu","badal","ankita","Abhinav","boon bhaiya","Chirag"};
        // Naive methode of displaying this array
        /*
        System.out.println("Displaying this String Array");
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
         */
        // here n is the value of array.length
        /*for ( int i=5;i>=0;--i){
            System.out.println(names[i]);
        }
         */
        for(String elements:names){
            System.out.println(elements);
        }
    }
}
