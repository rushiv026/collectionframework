package map;

import java.util.HashMap;
import java.util.Map;

public class CountOccance {
    public static void main(String[] args) {

        Map<Character,Integer> m=new HashMap();
        String a="rushirushikesh";
        int n=a.length();

        for(int i=0;i<n;i++)
        {
            char char1=a.charAt(i);
            System.out.println(char1);

            if(m.containsKey(char1))
            {
                m.put(char1,m.get(char1)+1);
            }
            else
            {
                m.put(char1,1);
            }
        }
        System.out.println(m);
    }
}

