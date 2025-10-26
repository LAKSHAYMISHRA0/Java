
public class LCM {
    public static int findGCD() {
        int a = 4;
        int b = 5;
        while(b!=0){
          int temp=b;
          b=a%b;
          a=temp;
        }
        return a;
    }
    public static int findLCM() {
        int a = 4;
        int b = 5;
        
        return a*b/findGCD();
    }
    public static void main(String[] args){
      int res=findLCM();
      System.out.print(res);
    }
}