package javalab;

import java.util.Scanner;
public class Matrixmultiplication 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row of first matrix");
		int m1=sc.nextInt();
		System.out.println("Enter the column of first matrix");
		int n1=sc.nextInt();
		System.out.println("Enter the row of second matrix");
		int m2=sc.nextInt();
		System.out.println("Enter the column of second matrix");
		int n2=sc.nextInt();
		if(m1!=n2)
		{
			System.out.println("Matrix Multiplication not possible");
			return;
		}
		int A[][]=new int[m1][n1];
		int B[][]=new int[m2][n2];
		int C[][]=new int[m1][n2];
		System.out.println("Read Matrix A");
		for(int i=0;i<m1;i++)
		{
			for(int j=0;j<n1;j++)
			{ 
				System.out.print("A["+i+"]["+j+"]=");
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("Read Matrix B");
		for(int i=0;i<m2;i++)
		{
			for(int j=0;j<n2;j++)
			{ 
				System.out.print("B["+i+"]["+j+"]=");
				B[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m1;i++)
		{
			for(int j=0;j<n2;j++)
			{   C[i][j]=0;
			    for(int k=0;k<n1;k++)
			    {
					C[i][j]+=A[i][k]*B[k][j];	
			    }	
			}
		}
		System.out.println("Matrix A is ");
		for(int i=0;i<m1;i++)
		{
			for(int j=0;j<n1;j++)
			{  
				System.out.print(A[i][j] +"\t");
			}
			System.out.println();
		}
		System.out.println("Matrix B is");
		for(int i=0;i<m2;i++)
		{
			for(int j=0;j<n2;j++)
			{  
				System.out.print(B[i][j] +"\t");
			}
			System.out.println();
		}
		System.out.println("Multiplied Matrix C is");
		for(int i=0;i<m1;i++)
		{
			for(int j=0;j<n2;j++)
			{  
				System.out.print(C[i][j] +"\t");
			}
			System.out.println();	
		}
	}
}