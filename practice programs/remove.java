import java.util.*;

public class remove{
    public static List<Integer> removeDuplicates() {
        List<Integer> lst = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
        Set<Integer> uniqueSet = new HashSet<>(lst);
        return new ArrayList<>(uniqueSet);
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates());
    }
}
