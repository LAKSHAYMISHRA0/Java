import java.io.*;
public class Sort {
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
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("\nARRAY AFTER SORTING -->");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
