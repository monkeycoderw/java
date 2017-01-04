//: reusing/FinalData.java
//	The effect of final on fields

package com.reusing07;

import java.util.Random;

class Value {
	int i; // Package access
	
	public Value(int i) {
		this.i = i;
	}
}

public class FinalData {
	
	private static Random rand = new Random(50);
	private String id;
	public FinalData(String id) { this.id = id; }
	// Can be compile-time constants:
	private final int valueOne = 9;
	private static final int VALUE_TWO = 99;
	// Typical public constant
	public static final int VALUE_THREE = 39;
	// Cannot be compile-time constants
	private final int i4 = rand.nextInt(20);
	static final int INT_5 = rand.nextInt(20);
	private Value v1 = new Value(11);
	private final Value v2 = new Value(22);
	private static final Value v3 = new Value(33);
	// Arrays:
	private final int[] a = { 1, 2, 3, 4, 5, 6 };
	public String toString() {
		return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		// final 基本类型，数据无法改变
		// final 对象（数组也是对象），不能改变引用
		// final static final 类第一次初始化，后面的类对象初始化值也不变
		FinalData fd1 = new FinalData("fd1");
		//! fd1.valueOne++; // Error: can't change value
		fd1.v2.i++; // Object is not constant!
		fd1.v1 = new Value(9); // OK -- not final
		for(int i = 0; i < fd1.a.length; i++) {
			fd1.a[i]++; // Object is not constants
		}
		//! fd1.v2 = new Value(0); // change reference
		//! fd1.a = new int[3];
		System.out.println(fd1);
		System.out.println("Creating new FinalData");
		FinalData fd2 = new FinalData("fd2");
		System.out.println(fd1);
		System.out.println(fd2);
	}

}
