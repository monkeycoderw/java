//: typeinfo/SweetShop.java
// Examination of the way the class loader works.

package com.typeinfo14;

class Candy {
	static { System.out.println("Loading Candy"); }
}

class Gum {
	static { System.out.println("Loading Gum"); }
}

class Cookie {
	static { System.out.println("Loading Cookie"); }
}

public class SweetShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main");
		new Candy();
		System.out.println("After creating candy");
		try {
			Class.forName("Gum");
		} catch (ClassNotFoundException e) {
			System.out.println("Could't find Gum");
		}
		System.out.println("After Class.forName(\"Gum\")");
		new Cookie();
		System.out.println("After creating Cookie");
	}

}
