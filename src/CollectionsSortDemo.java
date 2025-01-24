import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {
    public static void main(String[] args) {
        ArrayList l= new ArrayList();
        l.add("Z");
        l.add("M");
        l.add("A");
        l.add("K");
        l.add("a");
        System.out.println("Before Sorting"+ l);
      //  l.add(new Integer(5));
        l.add(null);
        Collections.sort(l);
        System.out.println("After Sorting" + l);


    }
}
