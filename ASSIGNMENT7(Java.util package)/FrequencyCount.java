import java.util.*;
import java.io.*;
public class FrequencyCount {
    public static void main(String[] args)throws IOException{
        Console con=System.console();
        System.out.println("Enter the file name -->");
        String Filename=con.readLine();
        HashMap map=new HashMap<>();
        BufferedReader reader=new BufferedReader(new FileReader(Filename));
        String line;
        while ((line=reader.readLine()) != null ){
            StringTokenizer st=new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                String word=st.nextToken().replace(".", "");
                if (map.containsKey(word)){
                    map.put(word,(Integer)map.get(word)+1);
                }else{
                    map.put(word,1);
                }
            }
        }
        reader.close();
        Set set=map.keySet();
        Iterator iter=set.iterator();
        System.out.println("Word Count -->");
        while (iter.hasNext()) {
            String key=(String)iter.next();
            System.out.println(key+":"+map.get(key));
        }
    }
}
