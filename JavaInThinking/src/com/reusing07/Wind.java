//: reusing/Wind.java
// Inheritance & upcasting.

package com.reusing07;

class Instrument {
	public void play() { System.out.println(" Play Instrument "); }
	static void tune(Instrument i) {
		// ...
		i.play();
	}
}

// The Wind objects are instruments
// because they have the same interface
public class Wind extends Instrument {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wind flute = new Wind();
		Instrument.tune(flute);
	}

}
