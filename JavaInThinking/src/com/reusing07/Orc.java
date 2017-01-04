//: reusing/Orc.java
// The protected key 

package com.reusing07;

class Villain {
	private String name;
	
	protected void set(String name) {
		this.name = name;
	}
	
	public Villain(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "I'm a Villain and my name is " + name;
	}
}

public class Orc extends Villain {

	private int orcNumber;
	
	public Orc(String name, int orcNumber) {
		super(name);
		this.orcNumber = orcNumber;
	}
	
	public void change(String name, int orcNumber) {
		set(name);
		this.orcNumber = orcNumber;
	}
	
	public String toString() {
		return "Orc + " + orcNumber + ":" + super.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// protected 子类或者同一个包中有权限使用
		Orc orc = new Orc("Limburge", 12);
		System.out.println(orc);
		orc.change("Bob", 19);
		System.out.println(orc);
	}

}
