public class Prime {
    public static boolean isPrime() {
        int n = 7;
        for(int i=2;i<=n;i++){
          if(n%i==0){
            return false;
          }else{
            return true;
          }
        }
        return false;
    }
    public static void main(String[] args){
      boolean res=isPrime();
      System.out.print(res);
    }
}