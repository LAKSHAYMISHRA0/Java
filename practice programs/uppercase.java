// import java.util.*;

// public class uppercase {
//     public static List<String> toUpperCase() {
//         List lst = Arrays.asList("java", "python", "cpp");
//         List<String> result=new ArrayList<>();
//         for(int i=0;i<lst.size();i++){
//           result.add(lst.get(i).toString().toUpperCase());
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         System.out.println(toUpperCase()); 
//     }
// }


import java.util.*;

public class uppercase{
    public static List<String> toUpperCase() {
        List lst = Arrays.asList("java", "python", "cpp");
        List<String> result=new ArrayList<>();
        for(int i=0;i<lst.size();i++)
        {
          result.add(lst.get(i).toString().toUpperCase());
        }
        return result;
    }
    public static void main(String[] args){
    List <String> res=toUpperCase();
    System.out.println(res);
    }
}