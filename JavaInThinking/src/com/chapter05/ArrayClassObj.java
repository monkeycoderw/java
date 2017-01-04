package com.chapter05;

import java.util.Arrays;
import java.util.Random;

public class ArrayClassObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		Integer[] a1 = new Integer[rand.nextInt(20)];
		
		for(int i = 0; i < a1.length; i++) {
			a1[i] = rand.nextInt(500);
		}
		
		System.out.println(Arrays.toString(a1));
		
		Integer[] a2 = new Integer[]{
		    new Integer(1),
		    new Integer(2),
		    3,
		};
		
		System.out.println(Arrays.toString(a2));
		
	}

}
