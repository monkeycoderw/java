//: innerclasses/GreenhouseController.java
// Configure and execute the greenhouse system.

package com.innerclasses10;
import com.innerclasses10.controller.*;

public class GreenHouseController {
	public static void main(String[] args) {
		GreenHouseControls gc = new GreenHouseControls();
		gc.addEvent(gc.new Bell(100));
		Event[] eventList = {
			gc.new ThermostatNight(0),
			gc.new LightOn(200),
			gc.new LightOff(400),
			gc.new WaterOn(600),
			gc.new WaterOff(800),
			gc.new ThermostatDay(1400)
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		gc.addEvent(new GreenHouseControls.Terminate(5000));
		gc.run();
	}
}
