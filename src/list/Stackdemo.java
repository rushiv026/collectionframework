package list;

import java.util.Iterator;
import java.util.Stack;

public class Stackdemo {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(2);
        s.push(0);
        s.push(null); s.push(null);
        s.push(null); s.push(null);

        s.push("rushi");

     System.out.println(s);
//
//        System.out.println(s.peek());
      //  System.out.println(s.pop());

        int n=s.size();

        for(int i=0;i<n;i++)
        {
            System.out.println(s.peek());
            s.pop();
        }





    }

}
