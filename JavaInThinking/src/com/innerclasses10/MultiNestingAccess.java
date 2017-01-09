//: innerclasses/MultiNestingAccess
// Nested classes can access all members of all
// levels of the classes they are nested within

package com.innerclasses10;

class MNA {
	private void f() {}
	class A {
		private void g() {}
		public class B {
			void h() {
				f();
				g();
			}
		}
	}
}

public class MultiNestingAccess {
	public static void main(String[] args) {
		MNA mna = new MNA();
		MNA.A mnaa = mna.new A();
		MNA.A.B mnaab = mnaa.new B();
	}
}
