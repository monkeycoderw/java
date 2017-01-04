//: interfaces/HorrowShow.java
// Extending an interface with inheritance

package com.interface09;

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destory();
}

interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMonster {
	public void menace() {}
	public void destory() {}
}

interface Vampire extends DangerousMonster, Lethal {
	public void drinkblood();
}

class VeryBadVampire implements Vampire {
	public void menace() {}
	public void destory() {}
	public void kill() {}
	public void drinkblood() {}
}

public class HorrorShow {

	static void u(Monster b) { b.menace(); }
	static void v(DangerousMonster d) {
		d.menace();
		d.destory();
	}
	static void w(Lethal l) { l.kill(); }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}

}
