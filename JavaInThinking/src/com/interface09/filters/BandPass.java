// interfaces/filters/BandPass.java

package com.interface09.filters;

public class BandPass extends Filter {
	double lowCutOff, highCutOff;
	public BandPass(double l, double h) {
		this.lowCutOff = l;
		this.highCutOff = h;
	}
	public Waveform process(Waveform input) { return input; }
}
