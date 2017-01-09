//: innerclass/Parcel7
// Expanded version of Parcel7.java

package com.innerclasses10;

public class Parcel7b {
	private class PContents implements Contents {
		private int id = 11;
		public int value() { return id; }
	}
	public Contents contents() {
		return new PContents();
	}
	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
	}	
}
