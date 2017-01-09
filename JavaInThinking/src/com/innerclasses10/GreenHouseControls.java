//: innerclasses/GreenHouseControls.java
// 

package com.innerclasses10;

import com.innerclasses10.controller.*;

public class GreenHouseControls extends Controller {
	private boolean light = false;
	public class LightOn extends Event {
		public LightOn(long delayTime) { super(delayTime); }
		public void action() {
			// Put the hardware control code here to physically turn on the light.
			light = true;
		}
		public String toString() { return "Light is on"; }
	}
	public class LightOff extends Event {
		public LightOff(long delayTime) { super(delayTime); }
		public void action() {
			light = false;
		}
		public String toString() { return "Light is off"; }
	}
	private boolean water = false;
	public class WaterOn extends Event {
		public WaterOn(long delayTime) { super(delayTime); }
		public void action() {
			water = true;
		}
		public String toString() { return "GreenHouse Water On"; }
	}
	public class WaterOff extends Event {
		public WaterOff(long delayTime) { super(delayTime); }
		public void action() {
			water = false;
		}
		public String toString() { return "GreenHouse Water off"; }
	}
	private String thermostat = "Day";
	public class ThermostatNight extends Event {
		ThermostatNight(long delayTime) { super(delayTime); }
		public void action() {
			thermostat = "Night";
		}
		public String toString() { return "Thermostat on Night setting"; }
		
	}
	public class ThermostatDay extends Event {
		public ThermostatDay(long delayTime) { super(delayTime); }
		public void action() { thermostat = "day"; }
		public String toString() { return "Thermostat on Day setting"; }
	}
	// An example of an action() that inserts 
	// a new one of itself into the event list:
	public class Bell extends Event {
		public Bell(long delayTime) { super(delayTime); }
		public void action() { addEvent(new Bell(delayTime)); }
		public String toString() { return "Bing!"; }
	}
	public class Restart extends Event {
		private Event[] eventList;
		public Restart(long delayTime, Event[] eventList) {
			super(delayTime);
			this.eventList = eventList;
		}
		public void action() {
			for(Event e: eventList) {
				e.start(); // return each event
				addEvent(e);
			}
		}
		public String toString() {
			return "Restarting system";
		}
	}
	public static class Terminate extends Event {
		public Terminate(long delayTime) { super(delayTime); }
		public void action() { 
			//System.exit(0); 
		}
		public String toString() { return "Terminating!"; }
	}
}
