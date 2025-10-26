public class Power {
    public static void main(String[] args) {
        int no,no1;
        no=(int)(Math.random()*10);
        no1=(int)(Math.random()*10);
        System.out.println("GENERATED NUMBER IS-->"+no+" AND "+no1);
        int result=1;
        for (int i = 1; i <=no1 ; i++) {
            result *=no;
        }
        System.out.println("RESULT IS-->"+result);
    }
}
