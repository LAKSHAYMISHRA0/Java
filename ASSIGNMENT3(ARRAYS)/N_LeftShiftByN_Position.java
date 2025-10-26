import java.io.*;
public class N_LeftShiftByN_Position {
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
        int n;
        System.out.println("\nENTER THE POSITION -->");
        n=Integer.parseInt(con.readLine());
        n=n%arr.length;
        for (int i = 0; i < n; i++) {
            // int temp=arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=0;
        }
        System.out.println("\nAFTER LEFT SHIFT ELEMENTS BY NO TIMES -->");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
