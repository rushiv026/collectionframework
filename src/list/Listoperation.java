package list;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;

public class Listoperation
{

    public static void main(String[] args) {

        ArrayList a=new ArrayList();


        a.add(10);
        a.add(20);
        a.add(30);
        System.out.println(a);

        a.add(1,30);
        System.out.println(a);

        System.out.println(a.contains(30));

        ArrayList a1=new ArrayList();
        a1.add(00);
        a1.add(90);
        a1.add(60);
        System.out.println(a1);




        a.addAll(a1);
        System.out.println(a);

        a.addAll(a);
        System.out.println(a);


        System.out.println(a.containsAll(a1));


        a.removeAll(a1);
        System.out.println("after remove"+a);

        System.out.println(a.size());

        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }


    }
}
