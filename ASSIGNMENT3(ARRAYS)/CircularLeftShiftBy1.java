import java.io.*;
public class CircularLeftShiftBy1 {
    public static void main(String[] args) {
        Console con=System.console();
        int arr[]=new int[10];
        int i,j;
        System.out.println("enter the values of the array-->");
        for ( i = 0; i < arr.length; i++){
            arr[i]=Integer.parseInt(con.readLine());
        }
        System.out.println("THE ARRAY BEFORE CIRCULAR LEFT SHIFT IS -->");
        for ( j = 0; j< arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
            int temp=arr[0];
            for(j=0; j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        
        System.out.println("\nARRAY AFTER CIRCULAR LEFT SHIFT -->");
        for(i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}


