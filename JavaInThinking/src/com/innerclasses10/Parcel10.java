//: innerclasses/Parcel10.java
// Using "instance" initialization" to perform
// constructor on an anonymous inner class.

package com.innerclasses10;

public class Parcel10 {

	public Destination 
	destination(final String dest, final float price) {
		return new Destination() {
			private int cost;
			{
				cost = Math.round(price);
				if(cost > 100) {
					System.out.println("Over budget!cost:" + cost );
				}
			}
			private String label = dest;
			public String readLabel() { return label; }
		};
	}
	public static void main(String[] args) {
		Parcel10 p = new Parcel10();
		Destination d= p.destination("Tasmania", 101.395F);
	}
}