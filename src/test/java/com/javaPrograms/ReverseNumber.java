package com.javaPrograms;

import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int rev=0;
		
		while(num>0)
		{
			rev=rev*10 + num%10;  
			num=num/10; 
		}
	
	/*	
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer reverse = sb.reverse();
		System.out.println("Reverse number is: "+reverse);
		
	*/
		System.out.println("Reverse number is "+rev);
	}
}
