package com.chapter05;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		int[] a1 = new int[rand.nextInt(20)];
		
		System.out.println(Arrays.toString(a1));
	}

}
