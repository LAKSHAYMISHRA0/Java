public class MinMax {
    public static void main(String[] args) {
        int num,min,max;
        num=(int)(Math.random()*100);
        System.out.println("GENERATED NUMBER-->"+num);
        max=num;
        min=num;
        for(int i=1;i<=9;i++){
            num=(int)(Math.random()*100);
            System.out.println(" "+num);
            if (num>max) {
                max=num;
            }
            if (num<min) {
                min=num;
            }
        }
        System.out.println("MAXIMUM-->"+max);
        System.out.println("MINIMUM-->"+min);
    }
}
