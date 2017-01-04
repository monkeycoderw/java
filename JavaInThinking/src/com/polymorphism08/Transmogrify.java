//: polymorphism/Transmogrify.java
// Dynamically changing the behaviorof an object
// via composition( the "State" design pattern )

package com.polymorphism08;

class Actor {
	public void act() {};
}

class HappyActor extends Actor {
	public void act() { System.out.println("Happy actor"); }
}

class SadActor extends Actor {
	public void act() { System.out.println("Sad actor"); }
}

class Stage {
	private Actor actor = new HappyActor();
	public void change() { actor = new SadActor(); }
	public void performPlay() { actor.act(); }
}
public class Transmogrify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}

}
