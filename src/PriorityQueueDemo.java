import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue p=new PriorityQueue<>();
        System.out.println(p.peek());//return null for empty Queue

        //System.out.println(p.element());throw no such argument exception

        System.out.println(p.poll());//return null for empty queue

        for(int i=0;i<=10;i++){
            p.offer(i);
        }
        System.out.println(p);//while printing order is not maintained
                              // its jvm dependent
        System.out.println(p.poll());//remove and return head element
        System.out.println(p.peek());//only return head element
        System.out.println(p);
    }
}
