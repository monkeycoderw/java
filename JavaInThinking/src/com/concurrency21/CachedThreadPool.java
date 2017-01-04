//: concurrency/CachedThreadPool

package com.concurrency21;

import java.util.concurrent.*;

public class CachedThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		exec.shutdown();
	}

}
