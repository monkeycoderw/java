//: reusing/Hide.java
// Overloading a base-class method name in a derived
// class does not hide the base-class versions.
// P136

package com.reusing07;

class Homer {
	char doh(char c) {
		System.out.println(" doh(char) ");
		return 'd';
	}
	
	float doh(float f) {
		System.out.println(" doh(float) ");
		return 1.0f;
	}	
}
class MilHouse {}

class Bart extends Homer {
	void doh(MilHouse m) {
		System.out.println(" doh(Milhouse) ");
	}
}

public class Hide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bart b = new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new MilHouse());
	}

}
