package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo {

    public static void main(String[] args) {


        List l=new ArrayList();
        l.add(130);
        l.add(203);
        l.add(30);
        l.add(23);
        l.add(30);
        l.add(3);
        l.add(31);



        System.out.println(l);

        l.add(null);
        l.add(null);
        //iterate
        Iterator i=l.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
            i.remove();

        }
        System.out.println(l);
    }
}
