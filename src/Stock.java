public class Stock {
    public static void main(String[] args) {
       // int[] a={100,200,250,200,200,300};
        int a[]={400,300,200,100,50,10};
        int max=0;
        int a1=1;
        int selling=0,buying=0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {

               int total=a[j]-a[i];


               if(total>max)
               {
                   buying=a[j];
                   selling=a[i];

                   max=total;
               }

            }
        }
        System.out.println("buying:"+selling+"\nselliing"+buying+"\ntotal"+max);


    }
}
