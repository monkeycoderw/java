//: reusing/Detergent.java

package com.reusing07;

class Cleanser {
	private String s = "cleaner";
	
	public void append(String a) { s += a; }
	public void dilute() { append(" dilute() "); }
	public void apply() { append(" apply() "); }
	public void scrub() { append(" scrub() "); }
	public String toString() { return s; }
	
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute(); x.apply(); x.scrub();
		System.out.println(x);
	}
		
}

public class Detergent extends Cleanser{
	
	//private String s = "Detergent";
	
	// Change a method
	public void scrub() {
		append(" Detergent.scrub() ");
		super.scrub();
	}
	
	// Add the method to the interface
	public void foam() { append(" foam() "); }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		Cleanser.main(args);		
	}

}
