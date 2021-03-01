package sorting;

import java.util.Scanner;

public class SelectionSort {
	    public static void selectionSort(int[] arr){  
	        for (int i=0;i<arr.length-1;i++)  
	        {  
	            int min_pos=i;  
	            for (int j=i+1;j<arr.length;j++){  
	                if (arr[j]<arr[min_pos]){  
	                    min_pos=j; 
	                }  
	            }  
	            int temp=arr[min_pos];   
	            arr[min_pos]=arr[i];  
	            arr[i]=temp;  
	        }  
	    }  
	       
	    public static void main(String a[]){  
	    	Scanner sc=new Scanner(System.in);
	    	int arr[]=new int[6];
	        System.out.println("Enter the array: ");
	        for(int i=0;i<6;i++)
	        {
	        	arr[i]=sc.nextInt();
	        }  
	         
	        long startTime= System.nanoTime();
	        selectionSort(arr); 
	        long endTime = System.nanoTime();
	        
	        long duration = (endTime - startTime);
	        
	        System.out.println("Time taken: "+ duration);
	         
	        System.out.println("Sorted Array: ");  
	        for(int i:arr){  
	            System.out.print(i+" ");  
	        }  
	    }   

}
