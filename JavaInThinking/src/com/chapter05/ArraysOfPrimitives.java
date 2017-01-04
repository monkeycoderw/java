package com.chapter05;

public class ArraysOfPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {1, 2, 3, 4, 5};
		int[] a2;
		a2 = a1;
		
		for(int i=0; i<a2.length; i++) {
			a1[i] = a1[i] + 3;
		}
		
		for(int i=0; i<a1.length; i++) {
			System.out.println(a1[i]);
		}
	}

}
