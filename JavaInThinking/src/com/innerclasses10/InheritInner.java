//: innerclasses/InheritInner.java
// Inheriting an inner class

package com.innerclasses10;

class WithInner {
	class Inner {
		
	}
}

public class InheritInner extends WithInner.Inner {

	public InheritInner(WithInner wi) {
		wi.super();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
	}

}
