public class GCD {
    public static int findGCD() {
        int a = 99;
        int b = 12;
        while(b!=0){
          int temp=b;
          b=a%b;
          a=temp;
        }
        return a;
    }
    public static void main(String[] args){
      int result=GCD.findGCD();
      System.out.println(result);
    }
}