//: reusing/PlaceSetting.java
// Combining composition & inheritance

package com.reusing07;

class Plate {
	Plate(int i) {
		System.out.println(" Plate Constructor " + i);
	}
}

class DinnerPlate extends Plate {
	DinnerPlate(int i) {
		super(i);
		System.out.println(" DinnerPlate Constructor " + i);
	}
}

class Utensil {
	Utensil(int i) {
		System.out.println(" Utensil Constructor " + i);
	}
}

class Spoon extends Utensil {
	Spoon(int i) {
		super(i);
		System.out.println(" Spoon Constructor " + i);
	}
}

class Knife extends Utensil {
	Knife(int i) {
		super(i);
		System.out.println(" Knife Constructor " + i);
	}
}

class Fork extends Utensil {
	Fork(int i) {
		super(i);
		System.out.println(" Fork Constructor " + i);
	}
}

class Custom {
	Custom(int i) {
		System.out.println(" Custom Constructor " + i);
	}
}

public class PlaceSettings extends Custom {
	
	private Spoon sp;
	private Knife kn;
	private Fork fk;
	private DinnerPlate pl;

	public PlaceSettings(int i) {
		super(i + 1);
		sp = new Spoon(i);
		fk = new Fork(i + 2);
		kn = new Knife(i + 3);
		pl = new DinnerPlate(i + 4);
		
		System.out.println(" PlaceSettings " + i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlaceSettings x = new PlaceSettings(0);
	}

}
