//: innerclass/controller/Controller.java
// The reusable framework for control systems.

package com.innerclasses10.controller;

import java.util.*;

public class Controller {
	// A class from java.util to hold Event objects:
	private List<Event> eventList = new ArrayList<Event>();
	public void addEvent(Event e) { eventList.add(e); }
	public void run() {
		while(eventList.size() > 0) {
			// Make a copy so you're not modifying the list
			// while you're selecting the elements in it:
			for(Event e: new ArrayList<Event>(eventList) ) { //从末尾开始遍历？
				System.out.println(eventList.size());
				if(e.ready()) {
					System.out.println(e);
					e.action();
					eventList.remove(e);
				}
			}
		}
	}
}
