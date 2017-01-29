//: typeinfo/Shapes.java

package com.typeinfo14;

import java.util.*;

abstract class Sharp {
	void draw() { System.out.println(this + ".draw()"); }
	abstract public String toString();
}

class Circle extends Sharp {
	public String toString() { return "Circle"; }
}

class Triangle extends Sharp {
	public String toString() { return "Triangle"; }
}

class Square extends Sharp {
	public String toString() { return "Square"; }
}

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Sharp> sharplist = Arrays.asList(
			new Circle(), new Triangle(), new Square()
		);
		
		for(Sharp sharp: sharplist) {
			sharp.draw();
		}
	}

}
