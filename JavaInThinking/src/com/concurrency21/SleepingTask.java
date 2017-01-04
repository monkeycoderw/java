//: concurrency/SleepingTask.java

package com.concurrency21;

import java.util.concurrent.*;

public class SleepingTask extends LiftOff{

	public void run() {
		try {
			while(countDown-- > 0) {
				System.out.println(status());
				TimeUnit.MILLISECONDS.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.err.println("Interrupt");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 5; i++) {
			exec.execute(new SleepingTask());
		}
	}

}
