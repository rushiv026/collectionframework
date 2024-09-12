package map;

import java.util.Hashtable;
import java.util.Map;

public class DemoHashtable {

    public static void main(String[] args)
    {
        Hashtable<Integer,String> t=new Hashtable();
        t.put(106,"deepak");
        t.put(102,"kamal");
        t.put(108,"Ravi");
        t.put(117,"Rahul");

        System.out.println(t);

        for(Map.Entry<Integer,String> e:t.entrySet()) {
            System.out.println(e.getKey()+e.getValue());

        }
    }
}
