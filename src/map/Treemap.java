package map;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {

    public static void main(String[] args) {
        TreeMap<Integer,String> t=new TreeMap();
        t.put(106,"deepak");
        t.put(102,"kamal");
        t.put(108,"Ravi");
        t.put(117,"Rahul");

        System.out.println(t);


        for(Map.Entry<Integer,String> e:t.entrySet())
        {
            System.out.println(e.getKey()+"->"+e.getValue());

        }
    }
}
