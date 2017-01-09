// innerclasses/Parcel2.java
// Returning a reference to an inner class

package com.innerclasses10;

public class Parcel2 {
	class Contents {
		private int i = 11;
		public int value() { return i; }
	}
	public Contents contents() {
		return new Contents();
	}
	class Destination {
		private String label;
		Destination(String whereTo) {
			label = whereTo;
		}
		public String readlabel() { return label; }
	}
	public Destination destination(String whereTo) {
		return new Destination(whereTo);
	}
	public void ship(String dest) {
		Contents c = contents();
		Destination d = destination(dest);
		System.out.println(d.readlabel());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel2 p = new Parcel2();
		p.ship("Tasmania");
		
		Parcel2 q = new Parcel2();
		Parcel2.Contents c = q.contents();
		Parcel2.Destination d = q.destination("Borneo");
		
		
	}

}
