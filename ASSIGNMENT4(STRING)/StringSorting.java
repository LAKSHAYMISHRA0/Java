import java.io.*;
public class StringSorting {
    public static void main(String[] args) {
        Console con=System.console();
        System.out.println("The before sorting-->");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]+" ");
        }
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args.length-i-1; j++) {
                if (args[j].compareTo(args[j+1])>0) {
                    String temp=args[j];
                    args[j]=args[j+1];
                    args[j+1]=temp;
                }
                
            }
        }
        System.out.println();
        System.out.println("\nThe array after sorting-->");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]+" ");
        }

    }
}
