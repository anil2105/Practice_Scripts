package com.javaPrograms;

import java.util.Scanner;

public class PalindromeString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String string = sc.nextLine();
		
		String rev="";
		
		String orgString=string;
		
		int len = string.length();
		
		for(int i=len-1; i>=0; i-- )
		{
			rev= rev + string.charAt(i);
		}
		if (orgString.equals(rev))
		{
			System.out.println(orgString+" is Palindrome string");
		}
		else
		{
			System.out.println(orgString+" is not Palindrome string");
		}
	}
}
