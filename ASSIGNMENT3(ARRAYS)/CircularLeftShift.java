import java.io.*;
public class CircularLeftShift {
    public static void main(String[] args) {
        Console con=System.console();
        int arr[]=new int[5];
        int i,j,position;
        System.out.println("enter the values of the array-->");
        for ( i = 0; i < arr.length; i++){
            arr[i]=Integer.parseInt(con.readLine());
        }
        System.out.println("THE ARRAY BEFORE CIRCULAR LEFT SHIFT IS -->");
        for ( j = 0; j< arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println("\nEnter the position from where you want to left shift -->");
        position=Integer.parseInt(con.readLine());
        for(i=0; i<position; i++){
            int a=arr[0];
            for(j=0; j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=a;
        }
        System.out.println("ARRAY AFTER CIRCULAR LEFT SHIFT -->");
        for(i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
