import java.io.Console;

public class MultiplicationOfMatrix {
    public static void main(String[] args) {
         int arr1[][]=new int[3][3];
         int arr2[][]=new int[3][3];
        Console con=System.console();
        int i,j;
        System.out.println("ENTER THE VALUE OF THE ARRAY 1-->");
        for ( i = 0; i < arr1.length; i++) {
            for( j=0; j<arr1[i].length; j++){
                arr1[i][j]=Integer.parseInt(con.readLine());
            }
        }
        System.out.println("MATRIX 1-->");
        for ( i = 0; i < arr1.length; i++) {
            for( j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("ENTER THE VALUE OF THE ARRAY 2-->");
        for ( i = 0; i < arr2.length; i++) {
            for( j=0; j<arr2[i].length; j++){
                arr2[i][j]=Integer.parseInt(con.readLine());
            }
        }
        System.out.println("MATRIX 2-->");
        for ( i = 0; i < arr2.length; i++) {
            for( j=0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        int result[][]=new int[3][3];
        for ( i = 0; i < arr1.length; i++) {
            for( j=0; j< arr2[i].length; j++){
                for (int k = 0; k < arr1[i].length; k++) {
                    result[i][j]+= arr1[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println("THE RESULT ARRAY -->");
        for ( i = 0; i < result.length; i++) {
            for( j=0; j<result[i].length; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
