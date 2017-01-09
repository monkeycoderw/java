//: innerclass/Parcel7.java
// Returning an instance of an anonymous inner class

package com.innerclasses10;

public class Parcel7 {

	public Contents contents() {
		return new Contents() {
			private int i = 11;
			public int value() { return i; }
		};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
		System.out.println(c.value());
	}

}
