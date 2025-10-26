public class Pattern5 {
    public static void main(String[] args) {
        int no,a=0;
        no = (int)(Math.random() * 10);
        System.out.println("GENERATED NUMBER IS --> " + no);
        for (int i = 1; i <= no; i++) {
            for (int j =1; j <=i; j++) {
                System.out.print(a+ " ");
                a++;
                if(a>1){
                a=0;
                }
            }
            System.out.println();
        }
    }
}
    
