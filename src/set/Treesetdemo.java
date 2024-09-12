package set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import list.demo;

public class Treesetdemo {

    public static void main(String[] args) {
        int a[]={3,2,4,1,7,9};


        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(40);
        ts.add(10);
        ts.add(30);
        ts.add(70);
        System.out.println(ts);

        TreeSet s=new TreeSet();
        s.add("rushi");
        s.add("rushii");
        s.add("rushia");
        System.out.println(s);
        List l=new ArrayList();
        l.add(130);
        l.add(203);
        l.add(30);
        l.add(23);
        l.add(30);
        l.add(3);
        l.add(31);
        TreeSet w=new TreeSet(l);

        System.out.println(w);

        System.out.println( w.comparator());

    }
}
