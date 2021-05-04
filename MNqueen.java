package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MNqueen {

	static List<List<Integer>> result= new ArrayList<>();

	static boolean isSafe(int board[][], int row, int col)
	{
     int i, j;
     int N = board.length;
     
     for (i=0;i<col;i++)
         if (board[row][i] == 1)
             return false;
     
     for (i=row,j=col;i>=0 && j>=0;i--,j--)
         if (board[i][j] == 1)
             return false;

         for (i = row, j = col; j >= 0 && i < N; i++, j--)
         if (board[i][j] == 1)
             return false;

     return true;
 }


 static boolean solveNQ(int board[][], int col)
 {
     
     int N=board.length;
     if (col==N) {

         List<Integer> n = new ArrayList<>();

         for (int i=0;i<N;i++) {
             for (int j=0;j<N;j++) {
                 if (board[i][j]==1)
                     n.add(j+1);
             }
         }
         result.add(n);
         return true;
     }

     boolean r=false;
     for (int i=0;i<N;i++) {
         
         if (isSafe(board,i,col)) {
             
             board[i][col]=1;

             r=solveNQ(board,col+1)||r;

             board[i][col]=0; 
         }
     }
     
     return r;
 }
 
 static List<List<Integer>>nQueen(int n)
 {
     result.clear();
     int board[][] = new int[n][n];
     solveNQ(board, 0);
      
     return result;
 }

 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
 	
 	System.out.println("Enter the value of n:");
 	int n=sc.nextInt();


     List<List<Integer>> resultant= nQueen(n);
     System.out.println(resultant);
 }
}
