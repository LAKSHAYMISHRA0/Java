public class fibonacci {
    public static int[] fibonacci() {
        int n = 5;
        int a=0,b=1,sum[]=new int[n];
        if(n>0)
        sum[0]=a;
        if(n>1)
        sum[1]=b;
        for(int i=2;i<n;i++)
        {
          sum[i]=a+b;
          a=b;
          b=sum[i];
        }
        return  sum;
    }
    public  static void main(String[] args){
      int result[]=fibonacci();
      for(int i=0;i<result.length-1;i++)
      System.out.println(result[i]+" ");
    }
}