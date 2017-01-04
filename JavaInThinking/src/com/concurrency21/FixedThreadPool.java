//: concurrency/FixedThreadPool.java

package com.concurrency21;

import java.util.concurrent.*;

public class FixedThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for(int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		exec.shutdown();
	}

}
