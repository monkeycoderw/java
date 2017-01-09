//: interfaces/Factories.java

package com.interface09;

interface Service {
	void method1();
	void method2();
}

interface ServiceFactory {
	Service getService();
}

class Implements1 implements Service {
	public void method1() {
		System.out.println("Implements1 method1");
	}
	public void method2() {
		System.out.println("Implements1 method2");
	}
}

class Implements1Factory implements ServiceFactory {
	public Service getService() {
		return new Implements1();
	}
}

class Implements2 implements Service {
	public void method1() {
		System.out.println("Implements2 method1");
	}
	public void method2() {
		System.out.println("Implements2 method2");
	}
}

class Implements2Factory implements ServiceFactory {
	public Service getService() {
		return new Implements2();
	}
}

public class Factories {

	public static void serviceConsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		serviceConsumer(new Implements1Factory());
		serviceConsumer(new Implements2Factory());
	}

}
