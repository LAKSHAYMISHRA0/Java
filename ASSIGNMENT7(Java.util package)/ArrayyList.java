import java.util.*;
public class ArrayyList {
    public static void main(String[] args) {
        // Vector v=new Vector<>();
        // v.add("Salesforce");
        // v.add("Apex");
        // v.add("LWC");
        // v.add("visualForce");

        ArrayList<String> alist=new ArrayList<String>();
        alist.add("C++");
        alist.add("Java");
        alist.add("Php");
        alist.add("Salesforce");
        alist.add("Apex");
        alist.add("LWC");
        alist.add("visualForce");

        alist.forEach(item->System.out.println(item+"\t"+item.length()));
        
        // for (int i = 0; i < alist.size(); i++) {
        //     System.out.println(alist.get(i));
        // }

        // Iterator iter=alist.iterator();
        // while (iter.hasNext()) {
        //     System.out.println(iter.next());
        // }

        // ListIterator liter=alist.listIterator();
        // while (liter.hasNext()) {
        //     System.out.println(liter.next());
        // }
        // while (liter.hasPrevious()) {
        //     System.out.println(liter.previous());
        // }

        // for (Object object : alist) {
        //     System.out.println(object);
        // }
    }
}
