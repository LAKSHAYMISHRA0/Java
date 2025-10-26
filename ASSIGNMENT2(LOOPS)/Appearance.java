public class Appearance {
    public static void main(String[] args) {
        int no1,no2,count=0;
        no1=(int)(Math.random()*100000);
        no2=(int)(Math.random()*10);
        System.out.println("GENERATED NUMBER IS -->"+no1+" AND "+no2);
        while (no1!=0) {
            int rem=no1%10;
            no1/=10;
            if (rem==no2) {
                count++;
            }
        }
        System.out.println("THE NO2 OCCURED -->"+count+" TIME !");


    }
}
