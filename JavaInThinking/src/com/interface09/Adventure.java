//: interfaces/Adventure.java
// Multiple interfaces

package com.interface09;

interface CanFlight {
	void flight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

class ActionCharactor {
	public void flight() {}
}

class Hero extends ActionCharactor
	implements CanFlight, CanSwim, CanFly {
	public void fly() {}
	public void swim() {}
}
public class Adventure {
	public static void t(CanFlight x) { x.flight(); }
	public static void u(CanSwim x) { x.swim(); }
	public static void v(CanFly x) { x.fly(); }
	public static void w(ActionCharactor x) { x.flight(); }
	
	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
	}

}
