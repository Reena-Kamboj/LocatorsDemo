import java.util.ArrayList;
import java.util.Collections;

public class CollectionSearchDemo {
    public static void main(String[] args) {
        ArrayList l =new ArrayList();
        l.add("Aditya");
        l.add("Babita");
        l.add("Samreet");
        l.add("Arpan");
        l.add("Suhani");
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        System.out.println(Collections.binarySearch(l,"Anisha"));
        System.out.println(Collections.binarySearch(l,"Arpan"));
    }
}
