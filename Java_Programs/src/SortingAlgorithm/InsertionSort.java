
package SortingAlgorithm;

import Algorithm.insertionSort;

public class InsertionSort 
{
    
    public void insertion_sort_test(int ar[])
    {
        int n=ar.length;                                   
        int temp;
       
        for(int i=1;i<n;i++)
        {
            int j=i-1;
            int key=ar[i];
            while(j>=0&&key<ar[j])
            {
               ar[j+1]=ar[j];
               j--;
                
            }
           ar[j+1]=key; 
        }
        
    }
    
    public static void main(String args[])
    {
        
        int ar[]={3,1,5,4,2,-6};
        System.out.println("Length is\t"+ar.length);
        insertionSort ob=new insertionSort();
        System.out.println("Before sort");
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
        ob.insertion_sort_test(ar);
        System.out.println("After sort");
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
        
    }
    
}
