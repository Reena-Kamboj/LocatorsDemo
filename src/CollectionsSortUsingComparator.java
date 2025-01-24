import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortUsingComparator {
    public static void main(String[] args) {
        ArrayList l =new ArrayList();
        l.add(15);
        l.add(10);
        l.add(0);
        l.add(20);
        l.add(5);
        System.out.println(l);
        Collections.sort(l,new MyComparator1());
        System.out.println(l);
    }
}
class MyComparator1 implements Comparator {
    public int compare(Object o1,Object o2){
        Integer i1=(Integer) o1;
        Integer i2=(Integer) o2;
        return i1.compareTo(i2);
    }
}