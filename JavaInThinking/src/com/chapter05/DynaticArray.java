package com.chapter05;

public class DynaticArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Other.main(new String[]{"hello", "fine", "ok"});
	}

}

class Other{
	
	public static void main(String[] args) {
		for(String s: args) {
			System.out.println(s);
		}
	}
}