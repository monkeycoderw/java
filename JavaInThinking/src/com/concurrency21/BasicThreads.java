//: concurrentcy/BasicThreads
// The most basic use of the Thread class

package com.concurrency21;

public class BasicThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new LiftOff());
		t.start();
		System.out.println("Waiting for LiftOff");
	}
	
}
