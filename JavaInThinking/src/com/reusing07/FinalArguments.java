//: reusing/FinalArguments
// Using "final" from with method arguments

package com.reusing07;

class Gizmo {
	public void span() { System.out.println(" span "); }
}

public class FinalArguments {

	void with(final Gizmo g) {
		// ! g = Gizmo();
	}
	
	void without(Gizmo g) {
		g = new Gizmo();
		g.span();
	}
	
	// void f(final int i) { i++; } // Can't change
	// You can only read from a final primitive
	
	int g(final int i) { return i + 1; }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalArguments bf = new FinalArguments();
		bf.with(null);
		bf.without(null);
	}

}
