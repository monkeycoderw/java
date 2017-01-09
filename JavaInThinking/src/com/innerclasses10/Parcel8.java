//: innnerclasses/Parcel8.java
// Calling the basic-class Constructor
 
package com.innerclasses10;

public class Parcel8 {

	public Wrapping wrapping(int x) {
		return new Wrapping(x) {
			public int value() {
				return super.value() * 50;
			}
		};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel8 p = new Parcel8();
		Wrapping w = p.wrapping(10);
		System.out.println(w.value());

	}

}
