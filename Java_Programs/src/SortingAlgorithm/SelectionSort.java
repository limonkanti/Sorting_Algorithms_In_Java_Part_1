
package SortingAlgorithm;


public class SelectionSort
{
     public void selectiontest(int ar[])
    {
        int n=ar.length; 
        int temp;
        for(int i=0;i<n-1;i++)
        {
            int index=i;
            for(int j=i+1;j<n;j++)
            {
                if(ar[j]<ar[index])
                {
                    index=j;
                }
               
            }
            int smallestNumber=ar[index];
            ar[index]=ar[i];
            ar[i]=smallestNumber;
        }
        
    }
    
    public static void main(String args[])
    {
        int ar[]={3,1,5,4,2,-6};
        System.out.println("Length is\t"+ar.length);
        SelectionSort ob=new SelectionSort();
        System.out.println("Before sort");
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
        ob.selectiontest(ar);
        System.out.println("After sort");
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
        
    }
    
}
