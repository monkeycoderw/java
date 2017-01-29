//: holding/AsListInference.java
// Arrays.list() makes its best guess about type.

package com.holding11;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}


public class AsListInference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Snow> snow1 = (ArrayList<Snow>) Arrays.asList(
			new Crusty(), new Slush(), new Powder());
		
		
		
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
		
		List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
		
	}

}
