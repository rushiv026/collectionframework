package set;

import java.util.HashSet;
import java.util.Set;

public class Setoperations {

    public static void main(String[] args) {


        Set s1=new HashSet();


        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(0);
        s1.add(0);
        s1.add(50);

        System.out.println(s1.size());

        System.out.println(s1);

        s1.contains(20);
        System.out.println(s1.remove(20));
        System.out.println(s1);
        System.out.println(s1.remove(80));





        Set s2=new HashSet();


        s2.add(10);
        s2.add(14);
        s2.add(14);
        s2.add(12);
        s2.add(11);
        s2.add(30);

        System.out.println(s2.containsAll(s1));

        System.out.println(s2);

    }
}
