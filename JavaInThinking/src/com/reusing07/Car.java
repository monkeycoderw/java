//: reusing/Car.java
// Composition with public objects

package com.reusing07;

class Engine {
	public void start() {}
	public void rec() {}
	public void stop() {}
}

class Wheel {
	public void inflate(int i) {}
}

class Window {
	public void rollup() {}
	public void rolldown() {}
}

class Door {
	public Window window = new Window();
	public void open() {}
	public void close() {}
}

public class Car {
	private Engine engine = new Engine();
	private Door
		left_door = new Door(),
		right_door = new Door();
	private Wheel[] wheel = new Wheel[4];
	
	public Car() {
		for(int i = 0; i < 4; i++) {
			wheel[i] = new Wheel();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.left_door.window.rollup();
		car.right_door.window.rollup();
		car.wheel[0].inflate(50);
	}

}
