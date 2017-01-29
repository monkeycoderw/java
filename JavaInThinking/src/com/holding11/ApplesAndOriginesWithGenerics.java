//: holding/ApplesAndOrangesWithGenerics.java

package com.holding11;

import java.util.ArrayList;

class Apple {
	private static long counter;
	private final long id = counter++;
	public long id() { return id; }
}

public class ApplesAndOriginesWithGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
		for(int i = 0; i < apples.size(); i++) {
			System.out.println(apples.get(i).id());
		}
		for(Apple c : apples)
			System.out.println(c.id());
	}

}
