//: polymorphism/StaticPolymorphism.java
// Static methods are not StaticPolymorphism

package com.polymorphism08;

class StaticSuper {
	public static String StaticGet() {
		return " Base staticGet ";
	}
	
	public String dynamicGet() {
		return " Base DynamicGet ";
	}
}

class StaticSub extends StaticSuper {
	public static String staticGet() {
		return " Sub staticGet ";
	}
	
	public String dynamicGet() {
		return " Sub dynamicGet ";
	}
}

public class StaticPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticSuper sub = new StaticSub();
		System.out.println(sub.StaticGet());
		System.out.println(sub.dynamicGet());
	}

}
