
import java.util.TreeMap;

public class NavigationMapDemo {
    public static void main(String[] args) {
        TreeMap<String,String> t=new TreeMap<>();//DNSO
        t.put("R","Reena");
        t.put("V","Vamika");
        t.put("A","Anushka");
        t.put("P","Priya");
        System.out.println(t);
        System.out.println(t.ceilingKey("V"));
        System.out.println(t.higherKey("P"));
        System.out.println(t.floorKey("V"));
        System.out.println(t.lowerKey("A"));
        System.out.println(t.pollFirstEntry());
        System.out.println(t.pollLastEntry());
        System.out.println(t.descendingMap());
    }
}
