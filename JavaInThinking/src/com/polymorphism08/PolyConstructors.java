//: Polymorphism/PolyConstructors.java
// Constructors and Polymorphism
// don't produce what you might expect

package com.polymorphism08;

class Glyph {
	void draw() { System.out.println("Glyph.draw()"); }
	public Glyph() {
		System.out.println("Glyph before Constructor");
		draw();
		System.out.println("Glyph after Constructor");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;
	void draw() { System.out.println("RoundGlyph.draw(), radius = " + radius); }
	public RoundGlyph(int radius) {
		this.radius = radius;
		System.out.println("RoundGlyph before Constructor()"); 
		draw();
		System.out.println("RoundGlyph after Constructor()"); 
	}
}

public class PolyConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RoundGlyph(5);
	}

}
