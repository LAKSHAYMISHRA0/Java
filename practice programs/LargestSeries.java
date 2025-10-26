public class LargestSeries {
    public static void main(String[] args) {
        int no,length=1,maxlen=1;
        no=(int)(Math.random()*100);
        System.out.print(no+" ");
        int pno=no;
        for (int i = 1; i <=9; i++) {
        no=(int)(Math.random()*100);
        System.out.print(no+" ");
        if (no>pno) {
            length++;
        }else{
            length=1;
        }
        pno=no;
        if (length>maxlen) {
            maxlen=length;
         }
        }
     System.out.println("\nMAXIMUM LENGTH SERIES IS-->"+maxlen);
    }
}
