package com.javaPrograms;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String string = sc.nextLine();
		String rev = "";
		
		int len = string.length();
		
		for(int i=len-1; i>=0; i--) 
		{
			rev=rev + string.charAt(i);
		}
		
		System.out.println("Reverse string is: "+rev);
		
	/*	
		StringBuffer sb=new StringBuffer(string);
		StringBuffer reverse = sb.reverse();
		System.out.println("Reverse string is: "+reverse);
	*/
		
	}
}
