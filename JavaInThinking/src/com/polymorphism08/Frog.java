//: polymorphism/Frog.java
// Cleanup and inheritance

package com.polymorphism08;

class Charactoristic {
	private String s;
	public Charactoristic(String s) {
		this.s = s;
		System.out.println("Creating Charactoristic");
	}
	protected void dispose() {
		System.out.println("Dispose Charactoristic");
	}
}

class Description {
	private String s;
	public Description(String s) {
		this.s = s;
		System.out.println("Creating Descrition");
	}
	protected void dispose() {
		System.out.println("Dispose Description");
	}
}

class LivingCreature {
	private Charactoristic p = new Charactoristic("is alive");
	private Description t = new Description("Basic Living Creature");
	public LivingCreature() {
		System.out.println("LivingCreature");
	}
	protected void dispose() {
		System.out.println("LivingCreated dispose");
		t.dispose();
		p.dispose();
	}
}

class Animal extends LivingCreature {
	private Charactoristic p = new Charactoristic("has heart");
	private Description t = new Description("Animal not Vegetable");
	public Animal() {
		System.out.println("Animal()");
	}
	protected void dispose() {
		System.out.println("Dispose Animal");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

class Amphibian extends Animal {
	private Charactoristic p = new Charactoristic("can live in water");
	private Description t = new Description("Both water and land");
	public Amphibian() {
		System.out.println("Amphibian");
	}
	protected void dispose() {
		System.out.println("Dispose Amphibian");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

public class Frog extends Amphibian{
	private Charactoristic p = new Charactoristic("Croaks");
	private Description t = new Description("Eats Bugs");
	public Frog() {
		System.out.println("Frog()");
	}
	protected void dispose() {
		System.out.println("Dispose Frog");
		t.dispose();
		p.dispose();
		super.dispose();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog = new Frog();
		System.out.println("Bye");
		frog.dispose();
	}

}
