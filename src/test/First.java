package test;

import java.io.*;
import java.util.*;

class First {
	public static void main(String[] args) {
		int n,i,j; 
		System.out.println("enter the number");
		Scanner scanner = new Scanner(System.in);
		n = scanner. nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}