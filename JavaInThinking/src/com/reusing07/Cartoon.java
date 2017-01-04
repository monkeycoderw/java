//: reusing:Cartoon.java

package com.reusing07;

class Art {	
	Art() { System.out.println(" Art() Construct!"); }
}
	
class Drawing extends Art {
	Drawing() { System.out.println(" Drawing() Construct!"); }
}

public class Cartoon extends Drawing {

	Cartoon() { System.out.println(" Cartoon() Construct!"); }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cartoon x = new Cartoon();
		

	}

}
