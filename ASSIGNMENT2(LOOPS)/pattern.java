public class pattern {
    public static void main(String[] args){
        int no;
        no=(int)(Math.random()*10);
        System.out.println("GENERATED NUMBER IS-->"+no);
        for (int i=1;i<=no;i++) {
            for (int j=i;j<no;j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {
               System.out.print(j);
            }
            for (int j=i-1;j>=1;j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
