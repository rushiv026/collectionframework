package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Demolinkedlist {

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add(10);
        l.addFirst(20);
        l.addLast(30);
        l.add(40);


        System.out.println(l);
        LinkedList l2=new LinkedList();
        l2.add(10);
        l2.addFirst(20);
        l2.addLast(30);
        l2.add(40);


        System.out.println(l2.containsAll(l));

        System.out.println(l2.addAll(l));

        System.out.println(l2);

        ListIterator i= l2.listIterator();
        while(i.hasNext())
        {
            i.next();
        }
        while (i.hasPrevious())
        {
            System.out.println(i.previous());
        }

        for(int i1=0;i1<l2.size();i1++)
        {
            System.out.println("elements"+l2.get(l2.size()-1-i1));

        }



    }
}
