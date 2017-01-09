//: innerclasses/ClassInInterface.java
// {main: ClassInInterface$Test}

package com.innerclasses10;

public interface ClassInInterface {
	void howdy();
	class Test implements ClassInInterface {
		public void howdy() {
			System.out.println("Howdy!");
		}
		public static void main(String[] args) {
			new Test().howdy();
		}
	}
}
