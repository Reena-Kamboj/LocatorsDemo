import java.util.Arrays;
import java.util.Comparator;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] a={10,4,16,33,21};
        System.out.println("primitive array before sorting");
        for(int i: a){
            System.out.println(i);
        }
        System.out.println("primitive array after Sorting");
        Arrays.sort(a);
        for(int i:a){
            System.out.println(i);
        }
        String[] s1={"R","A","G","M"};
        System.out.println("Before sorting array of objects ");
        for(String s:s1){
            System.out.println(s);
        }
        Arrays.sort(s1);
        System.out.println("After sorting array of objects");
        for(String s2:s1){
            System.out.println(s2);
        }
        System.out.println("before sorting array of objects using CSO");
        Arrays.sort(s1,new MyComparator2());
        for(String s2:s1){
            System.out.println(s2);
        }
    }
}
class MyComparator2 implements Comparator {
    public int compare(Object o1,Object o2){
        String i1=(String) o1;
        String i2=(String) o2;
        return i2.compareTo(i1);
    }
}