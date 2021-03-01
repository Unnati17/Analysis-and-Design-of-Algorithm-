package sorting;

import java.util.Random;

public class MergeSort {
	
	void merge(int arr[], int beg, int mid, int end)  
	{  
	  
	int l=mid-beg+1;  
	int r=end-mid;  
	  
	int Larr[]=new int [l];  
	int Rarr[]=new int [r];  
	  
		for(int i=0;i<l;++i)  
			Larr[i]=arr[beg+i];  
	  
		for (int j=0;j<r;++j)  
			Rarr[j]=arr[mid+1+j];  
	  
	  
	int i=0,j=0;  
	int k=beg;  
	while(i<l && j<r)  
	{  
		if(Larr[i]<=Rarr[j])  
		{  
			arr[k]=Larr[i];  
			i++;  
		}  
		else  
		{  
			arr[k] = Rarr[j];  
			j++;  
		}  
		k++;  
	}  
	while(i<l)  
	{  
			arr[k]=Larr[i];  
			i++;  
			k++;  
	}  
	  
	while(j<r)  
	{  
			arr[k]=Rarr[j];  
			j++;  
			k++;  
	}  
	}  
	  
	void sort(int arr[], int beg, int end)  
	{  
		if (beg<end)  
		{  
			int mid = (beg+end)/2;  
			sort(arr,beg,mid);  
			sort(arr,mid+1,end);  
			merge(arr,beg,mid,end);  
		}  
	}  
	public static void main(String args[])  
	{  
		MergeSort ob = new MergeSort();
		int arr[]=new int[1000];
		int arr1[]=new int[1000];
	    Random rand= new Random();
	        
	    for(int i=0;i<1000;i++)
	    {
	       arr[i]=rand.nextInt(10000);
	    }
	    
	    for(int i=0;i<1000;i++)
	    {
	       arr1[i]=8;
	    }
	    
	    long startTime= System.nanoTime();
	    ob.sort(arr, 0, arr.length-1); 
	    long endTime = System.nanoTime();
	    long duration = (endTime - startTime);
	    System.out.println("Time taken(random): "+ duration);   
	    
	    long starTime= System.nanoTime();
	    ob.sort(arr1, 0, arr1.length-1); 
	    long enTime = System.nanoTime();
	    long duratio = (enTime - starTime);
	    System.out.println("Time taken: "+ duratio);   
	  
		System.out.println("Sorted array");  
		for(int i =0; i<arr.length;i++)  
		{  
			System.out.println(arr[i]+"");  
		}  
		System.out.println("Descending order");  
		for(int i=arr.length-1; i>=0;i--)  
		{  
			System.out.println(arr[i]+"");  
		}  
		
		System.out.println("Similar no. array");
		for(int i =0; i<arr1.length;i++)  
		{  
			System.out.println(arr1[i]+"");  
		}  
		
		
	}  

}
