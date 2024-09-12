package set;

import java.util.*;

public class demo
{
    public static void main(String[] args) {


        Set s=new HashSet();
        s.add(10);
        s.add(20);
        s.add(10);
        s.add("a");
        s.add("a");

        s.add(null);
        s.add(null);
        System.out.println(s);

        Iterator i=s.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
