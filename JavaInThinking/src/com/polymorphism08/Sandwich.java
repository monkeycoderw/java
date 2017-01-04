//: polymorphism/Sandwitch.java
// Order of construtor calls

package com.polymorphism08;

class Meal {
	Meal() { System.out.println(" Meal() "); }
}

class Bread {
	Bread() { System.out.println(" Bread() "); }
}

class Cheese {
	Cheese() { System.out.println(" Cheese() "); }
}

class Lettuce {
	Lettuce() { System.out.println(" Lettuce() "); }
}
	
class Lunch extends Meal {
	Lunch() { System.out.println(" Luanch() "); }
}

class ProtableLunch extends Lunch {
	ProtableLunch() { System.out.println(" ProtableLunch "); }
}

public class Sandwich extends ProtableLunch {

	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	
	Sandwich() { System.out.println(" Sandwish() "); }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sandwich();
	}

}
