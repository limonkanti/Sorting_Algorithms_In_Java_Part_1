
package SortingAlgorithm;

public class BubbleSort
{
    public void bubbletest(int ar[])
    {
        int n=ar.length;
        int temp;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<(n-i);j++)
            {
                if(ar[j-1]>ar[j])
                {
                    temp=ar[j-1];
                    ar[j-1]=ar[j];
                    ar[j]=temp;              
                }
            }
        }
        
    }
    
    public static void main(String args[])
    {
        int ar[]={3,1,5,4,2};
        BubbleSort ob=new BubbleSort();
        System.out.println("Before sort");
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
        ob.bubbletest(ar);
        System.out.println("After sort");
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
        
    }
}
