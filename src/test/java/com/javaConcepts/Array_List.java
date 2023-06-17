package com.javaConcepts;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		ArrayList a = new ArrayList(); // arrayList accepts heterogeneous data types
		a.add(11);
		a.add("testing");
		a.add("java");
		a.add('b');
		a.add(12.22);
		a.add(10);
		a.add(1.1);
		a.add(true);

		System.out.println(a); // [11, testing, java, b, 12.22, 10, 1.1, true]
	}
}
