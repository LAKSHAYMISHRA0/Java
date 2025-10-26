public class Factorial {
    public static void main(String[] args) {
        int num,fact=1;
        num=(int)(Math.random()*10);
        System.out.println("GENERATED NO.-->"+num);
        for (int i = 1; i <=num; i++){
            fact*=i;
        }
        System.out.println("FACTORIAL-->"+fact);
    }
}
