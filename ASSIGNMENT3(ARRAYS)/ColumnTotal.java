import java.io.Console;

public class ColumnTotal {
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
        System.out.println("THE ARRAY -->");
        int sum[]=new int[3];
        for ( i = 0; i < arr.length; i++) {
            for( j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        for ( j = 0; j < arr[0].length; j++) {
            int result=0;
            for( i=0; i < arr.length; i++){
                result+=arr[i][j];
            }
            sum[j]=result;
        }
        System.out.println("THE ARRAY COLUMN WISE SUM -->");
        for ( i = 0; i < sum.length; i++) {
                System.out.print(sum[i]+" ");
            }
    }
}
