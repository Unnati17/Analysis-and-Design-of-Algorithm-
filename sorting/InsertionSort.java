package sorting;

import java.util.Scanner;

public class InsertionSort {
	    void sort(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=1;i<n;++i) { 
	            int key=arr[i]; 
	            int j=i-1; 
	            while(j>=0 && arr[j]>key) { 
	                arr[j+1]=arr[j]; 
	                j--; 
	            } 
	            arr[j+1]=key; 
	        } 
	    }
	  
	    public static void main(String args[]) 
	    {     
	        Scanner sc=new Scanner(System.in);
	        InsertionSort ob = new InsertionSort();
	    	int arr[]=new int[6];
	        System.out.println("Enter the array: ");
	        for(int i=0;i<6;i++)
	        {
	        	arr[i]=sc.nextInt();
	        }  
	         
	        long startTime= System.nanoTime();
	        ob.sort(arr); 
	        long endTime = System.nanoTime();
	        
	        long duration = (endTime - startTime);
	        
	        System.out.println("Time taken: "+ duration);
	         
	        System.out.println("Sorted Array: ");  
	        for(int i:arr){  
	            System.out.print(i+" ");  
	        }  
	    } 
}
