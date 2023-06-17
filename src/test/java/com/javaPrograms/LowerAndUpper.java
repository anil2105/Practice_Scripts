package com.javaPrograms;

public class LowerAndUpper 
{
	public static void main(String[] args) 
	{
		String s="AnilKumar";
		int upper=0;
		int lower=0;
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(ch>=65 && ch<=90)
			{
				upper++;
			}
			else 
			{
				lower++;
			}
		}
	
		System.out.println("Number of lower cases in a string is: "+lower);
		System.out.println("Number of upper cases in a string is: "+upper);
	}
}
