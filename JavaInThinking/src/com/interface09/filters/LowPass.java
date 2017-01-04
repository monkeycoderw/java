//: interfaces/filters/LowPass.java

package com.interface09.filters;

public class LowPass extends Filter {
	double cutoff;
	public LowPass(Double cutoff) { this.cutoff = cutoff; }
	public Waveform process(Waveform input) {
		return input;
	}
}
