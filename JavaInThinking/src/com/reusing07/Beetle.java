//: reusing/Beetle.java
// The full process of initialization

package com.reusing07;

class Insect {
	private int i = 9;
	protected int j;
	Insect() {
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}
	
	private static int x1 = printInit("static Insect.x1 initialized!");
	
	static int printInit(String s) {
		System.out.println(s);
		return 49;
	}
}

public class Beetle extends Insect {
	private int k = printInit("Beetle.k initialized");
	
	public Beetle() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	
	private static int x2 = printInit("Beetle.x2 initialized");
	
	static int printInit(String s) {
		System.out.println(s);
		return 39;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Beetle Constructor");
		Beetle b = new Beetle();
	}

}
