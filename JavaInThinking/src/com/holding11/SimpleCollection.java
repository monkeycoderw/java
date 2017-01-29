//: holiding/SimpleCollection.java

package com.holding11;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> c = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			c.add(i);
		}
		for(Integer i : c) {
			System.out.println(i);
		}
	}

}
