import java.io.*;

public class LeftShift {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Console con=System.console();
        System.out.println("Enter the elements for the array-->");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(con.readLine());
        }
        System.out.println("THE ARRAY IS ->");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        System.out.println("\nTHE ARRAY AFTER LEFT SHIFT-->");
        for (int i=0;i< arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
