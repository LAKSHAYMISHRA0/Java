public class seclargest {
    public static int secondLargest() {
        int[] lst = {4, 3, 1, 2};
        int largest=Integer.MIN_VALUE;
        int slargest=Integer.MIN_VALUE;
        for(int i=0;i<lst.length;i++){
          if(lst[i]>largest)
          {
            slargest=largest;
            largest=lst[i];
            
        }
        if(lst[i]>slargest && lst[i]!=largest){
            slargest=lst[i];
          }
        }
        
        return slargest;
    }
    public static void main(String[] args){
      int result=secondLargest();
      System.out.println(result);
    }
}