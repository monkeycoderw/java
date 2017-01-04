//: interfaces/Randoms.java
// Implementing an interface to comfirm to a method.

package com.interface09;

import java.nio.*;
import java.util.*;

public class RandomWords implements Readable{
	private static Random random = new Random(47);
	private static final char[] capitals = 
		"ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers = 
		"abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static final char[] vowels =
		"aeiou".toCharArray();
	private int count;
	public RandomWords(int count) { this.count = count; }
	public int read(CharBuffer cb) {
		if(count-- == 0) {
			return -1;
		}
		cb.append(capitals[random.nextInt(capitals.length)]);
		for(int i = 0; i < 5; i++) {
			cb.append(lowers[random.nextInt(lowers.length)]);
			cb.append(vowels[random.nextInt(vowels.length)]);
		}
		cb.append(" ");
		return 10;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(new RandomWords(15));
		while(s.hasNext()) {
			System.out.println(s.next());
		}
	}

}
