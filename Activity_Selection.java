package algorithm;

public class Activity_Selection {
	
	public static void MaxActivities(int s[], int e[], int n)
    {
    int i, j;
      
    System.out.print("Activities selected : ");
      
    i = 0;
    System.out.print(i+" ");
      
    for(j=1;j<n;j++)
    {
         if(s[j]>=e[i])
         {
              System.out.print(j+" ");
              i=j;
          }
     }
    
    }
      
    public static void main(String[] args)
    {
    int s[] =  {1, 3, 0, 5, 8, 5};
    int e[] =  {2, 4, 6, 7, 9, 9};
    int n = s.length;
        
    MaxActivities(s,e,n);
    }

}
