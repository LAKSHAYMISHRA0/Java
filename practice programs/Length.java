public class Length {
    public static int longestWordLength() {
        String sentence = "Java programming is fun";
        String[] temp=sentence.split(" ");
        int length=0;
        for(int i=0;i<temp.length;i++){
          String result=temp[i];
          if(result.length()>length){
            length=result.length();
          }
        }
        return length;
    }
    public static void main(String[] args){
      int res=longestWordLength();
      System.out.print(res);
    }
}
