public class Pattern6 {
    public static void main(String[] args){
        int no;
        no=(int)(Math.random()*10);
        System.out.println("GENERATED NUMBER IS-->"+no);
        for (int i=1;i<=no;i++) {
            for (int j=i;j<no;j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {
               System.out.print("*");
            }
            System.out.println();
        }
    }
}
