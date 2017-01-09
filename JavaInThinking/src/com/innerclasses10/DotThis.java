//: innerclasses/DotThis.java
// Qualifying access to the outer-class object

package com.innerclasses10;

public class DotThis {
	void f() { 
		System.out.println("DotThis.f()"); 
	}
	public class Inner {
		public DotThis outer() {
			return DotThis.this;
			// A plain "this" would be Inner's "this"
		}
	}
	public Inner inner() { return new Inner(); }
	public static void main(String[] args) {
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.outer().f();
		
		DotThis dt1 = new DotThis();
		DotThis.Inner dti1 = dt1.new Inner();
	}
	
}
