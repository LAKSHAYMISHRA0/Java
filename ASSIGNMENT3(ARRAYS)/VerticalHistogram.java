import java.io.*;
public class VerticalHistogram {
    public static void main(String[] args) {
        int arr[]=new int[10];
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
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) { // looop for finding the max value in the array
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        for (int i = max; i > 0; i--){ /// loop for settng the row from the max it will decrease the max value 
            for (int j = 0; j < arr.length; j++){
                if (arr[j]>=i){ // jab max decrease hota rahega or vo jab j >= ho jayega tab * print karenge 
                    System.out.print("*"+" ");
                }else{  // otherwise "sppace" print karenge 
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }       
    }
}
