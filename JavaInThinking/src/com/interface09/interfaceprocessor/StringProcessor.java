//: interfaces/interfaceprocessor/StringProcessor.java

package com.interface09.interfaceprocessor;

import java.util.*;

public abstract class StringProcessor implements Processor {
	public String name() {
		return getClass().getSimpleName();
	}
	
	public abstract String process(Object input);
	
	public static String s = 
		"If she weights the same as a duck, she's made of wood";
	public static void main(String[] args) {
		Apply.process(new Upcase(), s);
		Apply.process(new Downcase(), s);
		Apply.process(new Splitcase(), s);
	}
}

class Upcase extends StringProcessor {
	public String process(Object input) {
		return ((String)input).toUpperCase();
	}
}

class Downcase extends StringProcessor {
	public String process(Object input) {
		return ((String)input).toLowerCase();
	}
}

class Splitcase extends StringProcessor {
	public String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}