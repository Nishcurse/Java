import java.util.Scanner;
public class pratice_set_6 {
    public static void main(String[] args) {
        // Problem 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Practice Sheet");
        /*
        int[]no=new int[5];
        int sum =0;
        System.out.println(" First Entry");
        no[0]=sc.nextInt();
        System.out.println(" Second Entry");
        no[1]= sc.nextInt();
        System.out.println("Third Entry");
        no[2]= sc.nextInt();
        System.out.println(" Fourth Entry");
        no[3]= sc.nextInt();
        System.out.println(" Fifth Entry");
        no[4]= sc.nextInt();
        for(int elements:no){
            sum=sum+elements;
        }
        System.out.printf("the sum of this array is %d",sum);
        */
        //Problem 2
    /*    System.out.println("Enter the element you want to  check in Array!");
        int[]raju={23,3,23,423,34};
        boolean isInArray=false;
        int a = sc.nextInt();
        for(int elements:raju){
            if(a==elements){
                isInArray=true;
            }
        }if(isInArray){
            System.out.println("This integer is an element of the array");
        }else {
            System.out.println("This integer is NOT an element of the array");
        }
     */
        //Problem 3-Finding Average of an array by Using for loop
        /*int[]marks={98,56,78,90,87,67,89};
        int sum = 0 ;
        for(int elements:marks){
            sum=sum+elements;
        }
        float average = (float) sum / marks.length;
        System.out.println(sum);
        System.out.printf("The average of this array is %f)",average);
         */
        //Problem 4 - Making array by adding two different array
        /*
        int[][] mat1 = {{123, 443, 54}, {23, 54, 345}};
        int[][] mat2 = {{123, 34, 454}, {2334, 54565, 667,}
        };
        int[][] sum = {{0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for(int i=0;i<sum.length;i++){
            for (int j=0;j<sum[i].length;j++){
                System.out.print(sum[i][j]);
                System.out.print(" ");
            }System.out.print('\n');
        }
         */
        //problem 5-Java Program to reverse and array
        /*
        int[]arr={23,54,67,87,345,65};
        int a = Math.floorDiv(arr.length,2);
        System.out.println(a);
        int l = arr.length;
        int temp;
        for (int i= 0; i<a ;i++){
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int element:arr){
            System.out.print(element+" ");
        }*/
        // Problem 6
//        int[]arr={23,56,8,89,9867,56};
//        int  max= 0 ;
//        for(int e:arr){
//            if(e>max){
//                max = e;
//            }
//        }
//        System.out.println("The Greatest element in this array is:" + max);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        /* rough work
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                if(arr[i]>arr[j]) {
                    System.out.println("the greatest element in array would be:" + arr[i]);
                    break;
                }
            }*/
        // Problem 7-find th minimum element in an array;
//        int[]arr={23,56,8,89,2,56};
//        int min =Integer.MAX_VALUE;
//        for (int a:arr) {
//            if(min>a){
//                min=a;
//            }
//        }
//        System.out.println("The minimum value of the array is:" + min);
        // Problem 7 - Program to find whether a certain array is sorted or not
      /*  int[]array={12,56,78,89,90,123};
        boolean isSorted =false;
        for(int i=0;i< array.length-1;i++){
            if(array[i] < array[i+1]) {
                isSorted = true;
            }else {
                isSorted=false;
                break;
            }
            }
        if(isSorted){
            System.out.println("This array is sorted");
        }else{
            System.out.println("this array is not sorted");
        }
       */
    }
    }