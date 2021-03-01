package sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ComSorting {
	
	    void bubbleSort(int arr[])
	    {
	        int n=arr.length;
	        for(int i=0;i<n-1;i++) 
	        {
	            for(int j=0;j<n-i-1; j++)
	            {   if(arr[j]>arr[j+1])
	                {
	                    int temp=arr[j];
	                    arr[j]=arr[j+1];
	                    arr[j+1]=temp;
	                }
	            }
	        }
	        
	        
	    }
	    
	    
public static void selectionSort(int[] arr){  
	for (int i=0;i<arr.length-1;i++)  
		 {  
		     int min_pos=i;  
		     for (int j=i+1;j<arr.length;j++)
		      {  
		         if (arr[j]<arr[min_pos])
		           {  
		               min_pos=j; 
		            }  
		       }  
		       int temp=arr[min_pos];   
		       arr[min_pos]=arr[i];  
		       arr[i]=temp;  
		      }  
		 }  
		    
				 void sort(int arr[]) 
			    { 
			        int n = arr.length; 
			        for (int i=1;i<n;++i) 
			        { 
			            int key=arr[i]; 
			            int j=i-1; 
			            while(j>=0 && arr[j]>key) 
			            { 
			                arr[j+1]=arr[j]; 
			                j--; 
			            } 
			            arr[j+1]=key; 
			        } 
			    }
			    
			    
			 public static void main(String args[])
			 { 
		
			        BubbleSort bs = new BubbleSort();
			        InsertionSort ob = new InsertionSort();
			        int arr[]=new int[10000];
			        Random rand= new Random();
			        
			        for(int i=0;i<10000;i++)
			        {
			        	arr[i]=rand.nextInt(100000);
			        }
			        
			        int[] arr1=Arrays.copyOf(arr, 10000);
			        int[] arr2=Arrays.copyOf(arr, 10000);
			        
			        long startTime= System.nanoTime();
			        bs.bubbleSort(arr1);
			        long endTime = System.nanoTime();
			        long duration = (endTime - startTime);
			        System.out.println("Time taken(bubble): "+ duration);
			        
			        long stTime= System.nanoTime();
			        ob.sort(arr2); 
			        long eTime = System.nanoTime();
			        long dur = (eTime - stTime);
			        System.out.println("Time taken(insertion): "+ dur);
			        
			        long starTime= System.nanoTime();
			        selectionSort(arr); 
			        long enTime = System.nanoTime();
			        long duratio = (enTime - starTime);
			        System.out.println("Time taken(selection): "+ duratio);
			        
			        System.out.print("Sorted array is:");
			        for(int i=0;i<10000;++i)
			            System.out.println(arr[i]);
			      
			        
			    }

}
