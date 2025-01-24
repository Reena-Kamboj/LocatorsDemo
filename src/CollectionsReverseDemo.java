import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverseDemo {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(new Employee(1,"Jasleen"));
        a.add(new Employee(2,"Niya"));
        a.add(new Employee(3,"Priya"));
        System.out.println(a);
        Collections.reverse(a);
        System.out.println(a);//it just reverses the order of element
    }
}
class Employee{
    private int id;
    private String name;
    Employee(int id, String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return name;
    }
}
