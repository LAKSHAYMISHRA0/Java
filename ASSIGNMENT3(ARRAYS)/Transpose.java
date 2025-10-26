import java.io.*;
public class Transpose {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        Console con=System.console();
        int i,j;
        System.out.println("ENTER THE VALUE OF THE ARRAY-->");
        for ( i = 0; i < arr.length; i++) {
            for( j=0; j<arr[i].length; j++){
                arr[i][j]=Integer.parseInt(con.readLine());
            }
        }
        System.out.println("ARRAY BEFORE TRANSPOSE-->");
        for ( i = 0; i < arr.length; i++) {
            for( j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        int transpose[][]=new int[3][3];
        for ( i = 0; i < arr.length; i++) {
            for( j=0; j<arr[i].length; j++){
                transpose[j][i]=arr[i][j];
            }
        }
        System.out.println("THE ARRAY AFTER TRANSPOSE-->");
        for ( i = 0; i < arr.length; i++) {
            for( j=0; j<arr[i].length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
