package set;

import java.util.HashSet;

public class Hashsetdemo {

    public static void main(String[] args) {


        HashSet hs=new HashSet();
        hs.add(10);
        hs.add(20);
        hs.add(10);
        hs.add(30);
        hs.add(90);
        hs.add(true);
        hs.add(1);

        System.out.println(hs);

    }
}
