//: interfaces/nesting/NestingInterfaces.java

package com.interface09.nesting;

class A {
	interface B {
		void f();
	}
	public class BImp implements B {
		public void f() {}
	}
	private class BImp2 implements B {
		public void f() {}
	}
	public interface C {
		void f();
	}
	class CImp implements C {
		public void f() {}
	}
	private class CImp2 implements C {
		public void f() {}
	}
	private interface D {
		void f();
	}
	private class DImp implements D {
		public void f() {}
	}
	public class DImp2 implements D {
		public void f() {}
	}
	public D getD() { return new DImp2(); }
	private D dRef;
	public void receiveD(D d) {
		dRef = d;
		dRef.f();
	}
}

interface E {
	interface G {
		void f();
	}
	// Redundant "public"
	public interface H {
		void f();
	}
	void g();
	// Cannot be private within an interface;
	//! private interface I {}
}

public class NestingInterfaces {
	public class BImp implements A.B {
		public void f() {}
	}
	class CImp implements A.C {
		public void f() {}
	}
	// Cannot implements a private interface except 
	// within that interface's defining class:
	//! class Dimp impletments A.D {
	//	public void f();
	//}
	class EImp implements E {
		public void g() {}
	}
	class EGImp implements E.G {
		public void f() {}
	}
	class EImp2 implements E {
		public void g() {}
		class EG implements E.G {
			public void f() {}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		// Cannot access A.D:
		//! A.D ad = a.getD();
		// donot return anything but A.D
		//! A.DImp2 di2 = a.getD();
		// Cannot access a member of the interface:
		//! a.getD().f();
		//only another A can do anything with getD():
		A a2 = new A();
		a2.receiveD(a.getD());
	}

}
