//: interfaces/classprocessor/Apply.java

package com.interface09.classprocessor;

import java.util.Arrays;

class Processor {
	public String name() {
		return this.getClass().getSimpleName();
	}
	Object process(Object input) { return input; }
}

class Upcase extends Processor {
	String process(Object input) {
		return ((String)input).toUpperCase();
	}
}

class Downcase extends Processor {
	String process(Object input) {
		return ((String)input).toLowerCase();
	}
}

class Spliter extends Processor {
	String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}

public class Apply {
	public static void process(Processor p, Object s) {
		System.out.println("Using processor" + p.name());
		System.out.println(p.process(s));
	}
	public static String s = 
		"I am a good boy. Happy New Year!";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Spliter(), s);
	}

}
