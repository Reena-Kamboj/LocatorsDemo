package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        demoOfHashCodeAndEquals();
    }
        private static void demoOfHashCodeAndEquals (){
            Map<LockerId, Customer> m = new HashMap<>();
            m.put(new LockerId(1, "Mahira"), new Customer("Mahira", 25));
            m.put(new LockerId(2, "Aarav"), new Customer("Aarav", 26));
            System.out.println("Give me the value of Mahira:" + m.get(new LockerId(1, "Mahira")));

            System.out.println("Map has" + m.size() + "number of Enteries");
            System.out.println(m.containsValue(new Customer("Andy Wilson", 31)));
        }

}



class LockerId{
    int id;
    String firstName;
    LockerId(int id,String firstName){
        this.id=id;
        this.firstName=firstName;
    }
    public int hashCode(){           //if we don't override hashcode then
        return firstName.length();// we are able to add but not able to find the element because
        // hashcode is native method and its output is jvm dependent
    }


    //if we don't override equals the equals method then it calls equal method of
    // object class treat every object a different object
    public boolean equals(Object obj) {
     LockerId custId=(LockerId) obj;
     return this.id==custId.id && this.firstName.equals(custId.firstName);
    }

}


class Customer{
    String name;
    int age;
    Customer(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
   public boolean equals(Object obj) {
        if(obj instanceof Customer){
            Customer ct=(Customer) obj;
            return this.name.equals(ct.equals(ct.name)&& this.age==ct.age);
      }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
