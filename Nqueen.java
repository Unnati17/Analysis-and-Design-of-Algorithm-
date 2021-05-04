package algorithm;

import java.util.Scanner;

public class Nqueen{
	  
	    void print(int board[][],int N)
	    {
	        for(int i=0;i<N;i++) 
	        {
	            for(int j=0;j<N;j++)
	            	
	            if(board[i][j]==1)
	            	System.out.println("At position: "+j);
	            
	            System.out.println();
	        }
	        
	        
	    }
	  
	    boolean isSafe(int board[][], int row, int col,int N)
	    {
	        int i,j;
	  
	        for (i=0;i<col;i++)
	            if (board[row][i]==1)
	                return false;
	  
	        for (i=row,j=col;i>=0 && j>=0;i--,j--)
	            if (board[i][j]==1)
	                return false;
	  
	        for (i=row,j=col;j>=0 && i<N;i++,j--)
	            if (board[i][j]==1)
	                return false;
	  
	        return true;
	    }
	  
	    boolean solveNQ(int board[][], int col,int N)
	    {
	        if (col>=N)
	            return true;
	  
	        for (int i=0;i<N;i++) 
	        {    
	            if (isSafe(board,i,col,N)) 
	            {    
	                board[i][col]=1;
	  
	                if (solveNQ(board,col+1,N)==true)
	                    return true;
	  
	                board[i][col]=0;
	            }
	        }
	        return false;
	    }
	  
	    boolean solveNQ(int N)
	    {
	        int board[][]=new int[N][N];
	  
	        if (solveNQ(board,0,N)==false) {
	            System.out.print("Solution does not exist");
	            return false;
	        }
	  
	        print(board,N);
	        return true;
	    }
	  
	    public static void main(String args[])
	    {
	    	Scanner sc=new Scanner(System.in);
	    	
	    	System.out.println("Enter the value of n:");
	    	int n=sc.nextInt();
	    	
	        Nqueen q = new Nqueen();
	        q.solveNQ(n);
	    }
	    
}

