import java.io.*;
public class HorizontalHistogram {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Console con=System.console();
        System.out.println("ENTER 10 VALUES FROM 1 TO 9 -->");
        for (int i = 0; i < arr.length; i++){
            arr[i]=Integer.parseInt(con.readLine());
        }
        System.out.println("THE ARRAY -->");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("*  ");
            }
            System.out.println();
            
        }
    }
}
