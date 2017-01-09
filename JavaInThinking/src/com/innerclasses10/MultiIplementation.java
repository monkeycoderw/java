//: innerclasses/MultiImplementation.java
// 类和抽象类的多继承

package com.innerclasses10;

class D {}

abstract class E {}

class Z extends D {
	E makeE() { return new E() {}; }
}

public class MultiIplementation {
	static void takesD(D d) {}
	static void takesE(E e) {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z z = new Z();
		takesD(z);
		takesE(z.makeE());
	}
}
