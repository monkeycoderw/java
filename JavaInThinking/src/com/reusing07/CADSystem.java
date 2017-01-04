//: reusing/CADSystem.java
// Ensuring proper cleanup

package com.reusing07;

class Sharp {
	Sharp(int i) { System.out.println(" Sharp Construct "); }
	void dispose() { System.out.println(" Dispose Sharp "); }
	
}

class Circle extends Sharp {
	Circle(int i) {
		super(i);
		System.out.println(" Circle Construct "); 
	}
	
	void dispose() {
		System.out.println(" Dispose Circle ");
		super.dispose();
	}
}

class Triangle extends Sharp {
	Triangle(int i) {
		super(i);
		System.out.println(" Triangle Construct ");
	}
	
	void dispose() {
		System.out.println(" Dispose Triangle"); 
		super.dispose();
	}
}

class Line extends Sharp {
	private int start, end;
	
	Line(int start, int end) {
		super(start);
		this.start = start;
		this.end = end;
		System.out.println(" Drawing Line:" + start + ", " + end);
	}

	void dispose() {
		System.out.println(" Dispose Line: " + start + ", " + end); 
		super.dispose();
	}
}

public class CADSystem extends Sharp{
	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[3];
	public CADSystem(int i) {
		super(i + 1);
		for(int j = 0; j < lines.length; j++) {
			lines[j] = new Line(j, j*j);
		}		
		this.c = new Circle(1);
		this.t = new Triangle(1);
		System.out.println(" Combined Constructor ");
	}
	
	void dispose() {
		System.out.println(" Dispose CADSystem ");
		t.dispose();
		c.dispose();
		for(int i = lines.length - 1; i > 0; i--) {
			lines[i].dispose();
		}
		super.dispose();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CADSystem x = new CADSystem(47);
		try {
			//
		} finally {
			x.dispose();
		}
	}

}
