import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIterator {
    public static void main(String[] args) {
        demoForMapIterator();
}
public static void demoForMapIterator(){
    Map<Integer,String > m= new HashMap<>();
    m.put(11,"Reena");
    m.put(12,"Renu");
    m.put(13,"Nayra");
    Set<Map.Entry<Integer,String>> entries=m.entrySet();
    Iterator<Map.Entry<Integer,String>> i=entries.iterator();
    while(i.hasNext()){
      Map.Entry<Integer,String> next=i.next();
        System.out.println(next.getKey());
        System.out.println(next.getValue());
    }

    }
}



