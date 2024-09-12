package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;


public class ex {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,1};

        HashSet<Integer> h=new HashSet<Integer>();

        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            h.add(arr[i]);


        }
        System.out.println(h);
        for(int s:h)
        {
            count+=s;
        }
        System.out.println(count);
    }
}
