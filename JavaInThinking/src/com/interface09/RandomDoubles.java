//: interfaces/RandomDoubels.java

package com.interface09;

import java.util.*;

public class RandomDoubles {
	private static Random rand = new Random(47);
	public double next() { return rand.nextDouble(); }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomDoubles rd = new RandomDoubles();
		for(int i = 0; i < 7; i++) {
			System.out.println(rd.next() + " ");
		}
	}

}
