package com.java;

public class Arrays {

	public static void main(String[] args) {

		String[] names = { "dileep", "divya", "Manoj" ,"dileep"};
		int lengthh = names.length;

		for (int i = 0; i < lengthh; i++) { // 3<3
			System.out.println(names[i]);
		}

		int[] num = { 1, 2, 3, 4 };
		int lengthn = num.length;

		for (int i = 0; i < lengthn; i++) { // 3<3
			System.out.println(num[i]);
		}
		
		for(int numval : num) {
			System.out.println(numval);
		}
		
		int[] v =  new int[1];
		
		v[0] = 2;
		v[1] = 34;
		
		

	}

}
