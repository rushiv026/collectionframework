package map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap
{

    public static void main(String[] args) {
        HashMap<Integer,String > h=new HashMap();

        h.put(10,"rushi");
        h.put(20,"ganesh");
        h.put(13,"rushikesh");
        System.out.println(h);

        System.out.println(h.containsKey(10));

        System.out.println(h.keySet());


        for(Map.Entry e:h.entrySet())
        {
            System.out.println(e.getKey()+"->"+e.getValue());

        }
    }




}
