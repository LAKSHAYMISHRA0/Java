// public class swap 
// {
//    public static void swaping(int a,int b)
//     {
//         int temp=a;
//         a=b;
//         b=temp;
//         System.out.print(a);
//         System.out.println("\n"+b);
//     }
//     public static void main(String[] args){
//         int a=9,b=10;
//         System.out.println("before swapping -->\n"+a);
//         System.out.println(b);
//         System.out.println("after swaping-->");
//         swaping(a,b);

//     }
    
// }//without using the third variable
public class swap 
{
   public static void swaping(int a,int b)
    {
        a=a+b;//9+10=19
        b=a-b;//19-10=9
        a=a-b;//19-9=10
        System.out.print(a);
        System.out.println("\n"+b);
    }
    public static void main(String[] args){
        int a=9,b=10;
        System.out.println("before swapping -->\n"+a);
        System.out.println(b);
        System.out.println("after swaping-->");
        swaping(a,b);

    }
    
}

