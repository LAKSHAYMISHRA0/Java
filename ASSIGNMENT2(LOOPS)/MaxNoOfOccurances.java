public class MaxNoOfOccurances {
public static void main(String[] args) {
    int i,no,max,count=0;
    System.out.println("GENERATED VALUES ARE-->");
    for (i = 1,max=0; i <=10; i++) {
        no=(int)(Math.random()*10);
        System.out.println(no+" ");
        if(no==max){
            count=count+1;
            }
        if (no>max) {
            max=no;
            count=1;
        }
        
    }
    System.out.println("MAXIMUM IS -->"+max+" OCCURANCE-->"+count);
}
    
}