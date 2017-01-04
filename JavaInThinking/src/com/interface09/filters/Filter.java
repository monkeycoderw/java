//: interface/filters/Filter.java

package com.interface09.filters;

public class Filter {
	public String name() {
		return getClass().getSimpleName();
	}
	public Waveform process(Waveform input) { return input; }
}
