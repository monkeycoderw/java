//: polymorphism/music3/Music3.java
// An extensible program

package com.polymorphism08.music3;

class Instrument {
	void play(Note n) { System.out.println(" Instrument.play() " + n); }
	String what() { return "Instrument"; }
	void adjust() { System.out.println(" Adjusting Instrument "); }
}

class Wind extends Instrument {
	void play(Note n) { System.out.println(" Wind.play() " + n); }
	String what() { return "Wind"; }
	void adjust() { System.out.println(" Adjusting Wind "); }
}

class Percussion extends Instrument {
	void play(Note n) { System.out.println(" Percussion.play() " + n); }
	String what() { return "Percussion"; }
	void adjust() { System.out.println(" Adjusting Percussion "); }
}

class Stringed extends Instrument {
	void play(Note n) { System.out.println(" Stringed.play() " + n); }
	String what() { return "Stringed.play()"; }
	void adjust() { System.out.println(" Adjusting Stringed"); }
}

class WoodWind extends Wind {
	void play(Note n) { System.out.println(" WoodWind.play() " + n); }
	void adjust() { System.out.println(" adjusting WoodWind() "); }
}

class Brass extends Wind {
	void play(Note n) { System.out.println(" Brass.play() " + n); }
	String what() { return "Brass"; }
}

public class Music3 {
	
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void tuneall(Instrument[] e) {
		for(Instrument s: e) {
			tune(s);
		}
	}
	
	public static void main(String[] args) {
		Instrument[] orchestra = {
			new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new WoodWind()
		};
		tuneall(orchestra);
	}
}
