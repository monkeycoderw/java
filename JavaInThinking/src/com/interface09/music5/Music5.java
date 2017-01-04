//: interfaces/music5/Music5.java
// Interfaces

package com.interface09.music5;

interface Instrument {
	// Compile-time constant
	int VALUE = 5;
	// Cannot have the method definitions
	void play(Note n); //Automatically public
	void adjust();
}

class Wind implements Instrument {
	public void play(Note n) {
		System.out.println(this + ", play()" + n);
	}
	public String toString() { return "Wind"; }
	public void adjust() {
		System.out.println(this + ", adjust()");
	}
}

class Percussion implements Instrument {
	public void play(Note n) { 
		System.out.println(this + ", play()" + n);
	}
	public String toString() {
		return "Percussion";
	}
	public void adjust() {
		System.out.println(this + ", adjust()");
	}
}

class Stringed implements Instrument {
	public void play(Note n) {
		System.out.println(this + ", play()" + n);
	}
	public String toString() {
		return "Stringed";
	}
	public void adjust() {
		System.out.println(this + ", adjust()");
	}
}

class WoodWind extends Wind {
	public String toString() {
		return "WoodWind";
	}
}

class Brass extends Wind {
	public String toString() {
		return "Brass";
	}
}

public class Music5 {

	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e) {
		for(Instrument i: e ) {
			tune(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument[] e = {
			new Wind(),
			new Percussion(),
			new Stringed(),
			new WoodWind(),
			new Brass()
		};
		tuneAll(e);
	}

}
