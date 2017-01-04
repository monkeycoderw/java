//: reusing/BlankFinal.java
// "Blank" final fields

package com.reusing07;

class Poppet {
	private int i;
	Poppet(int i) { this.i = i; }
	
	public String toString() {
		return "Poppet.i = " + i; 
	}
}

public class BlankFinal {

	private final int i = 0; // Initialized final
	private final int j; // Blank final
	private final Poppet p; // Blank final reference
	
	public BlankFinal() {
		this.j = 1;
		this.p = new Poppet(1);
	}
	
	public BlankFinal(int x) {
		this.j = x;
		this.p = new Poppet(x);
	}
	
	public String toString() {
		return "i = " + i + ", j = " + j + ", " + p;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new BlankFinal());
		System.out.println(new BlankFinal(47));
	}

}
