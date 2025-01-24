import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {
    public static void main(String[] args) {
        PriorityQueue p=new PriorityQueue(10,new MyComparator());
        p.add("D");
        p.add("H");
        p.add("L");
        p.add("Z");
        System.out.println(p.poll());
        System.out.println(p.peek());
        System.out.println(p);
        System.out.println(p.poll());
        System.out.println(p);
    }
}
class MyComparator implements Comparator{
    public int compare(Object o1,Object o2){
        String s1=(String)o1;
        String s2=(String)o2;
        return s2.compareTo(s1);
    }
}