package com.practice;

//parent class constructor calling --> by using super keyword
public class Parent 
{
	Parent(int a, boolean b)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println("Parent class constructor");
	}
}

class Child extends Parent
{
	Child(String s) 
	{	
		super(10, false); // parent class constructor calling-->super keyword
		System.out.println(s);
		System.out.println("Child calss constructor");
	}

	public static void main(String[] args) {
		Child c1 = new Child("Microsoft");
	}

}
