//: innnerclasses/Parcel9.java
// An anonymous inner class that performs
// initialization. A brifer version of Parcel5.java

package com.innerclasses10;

public class Parcel9 {
	// Argument must be final to use inside
	// anonymous inner class
	public Destination destination(final String x) {
		return new Destination() {
			private String label = x;
			public String readLabel() { return label; }
		};
	}
	public static void main(String[] args) {
		Parcel9 p = new Parcel9();
		Destination d = p.destination("Tasmania");
	}
}
