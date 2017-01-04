//: interfaces/music4/Music4.java
// Abstractor class and method

package com.interface09.music4;

abstract class Instrument {
	private int i;
	public abstract void play(Note n);
	public String what() { return "Instrument"; }
	public abstract void adjust();
}

class Wind extends Instrument {
	public void play(Note n) {
		System.out.println("Wind play " + n);
	}
	public String what() { return "Wind"; }
	
	public void adjust() {}
}

class Percussion extends Instrument {
	public void play(Note n) {
		System.out.println("Percussion play " + n);
	}
	
	public String what() { return "Percussion"; }
	
	public void adjust() {}
}

class Stringed extends Instrument {
	public void play(Note n) {
		System.out.println("Stringed " + n);
	}
	
	public String what() { return "Stringed"; }
	
	public void adjust() {}
}

class WoodWind extends Wind {
	public void play(Note n) {
		System.out.println("WoodWind " + n); 
	}
	
	public String what() { return "WoodWind"; }
	
	public void adjust() {}
}

class Brass extends Wind {
	public void play(Note n) {
		System.out.println("Brass " + n);
	}
	
	public String what() { return "Brass"; }
	
	public void adjust() {}
}

public class Music4 {

	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void tuneAll(Instrument[] e) {
		for(Instrument i: e) {
			tune(i);
		}
	}
	
	public static void main(String[] args) {
		Instrument[] orchestra = {
			new WoodWind(),
			new Brass(),
			new Stringed(),
			new Wind(),
			new Percussion()
		};
		
		tuneAll(orchestra);
	}
}
