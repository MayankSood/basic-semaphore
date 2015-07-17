package com.mayank.thread.semaphore;

import java.util.concurrent.atomic.AtomicInteger;

public class BasicSemaphore {
	
	private static final int MAX_THREADS = 5;
	
	private volatile AtomicInteger aquiredThreads = new AtomicInteger(0);
	
	public void aquireLock() {
		synchronized (this) {
			while (getState() == State.CLOSE) {
				try {
					wait(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		aquiredThreads.incrementAndGet();
		
		System.out.println(Thread.currentThread().getName()+"-aquire()------"+aquiredThreads.get());
		
	}
	
	public void releaseLock() {
		synchronized (this) {
			if (aquiredThreads.get() > 0) {
				aquiredThreads.decrementAndGet();
			} else {
				aquiredThreads = new AtomicInteger(0);
			}
			notify();
		}
		System.out.println(Thread.currentThread().getName()+"-release()------"+aquiredThreads.get());
	}
	
	private State getState() {
		if (aquiredThreads.get() == MAX_THREADS) {
			return State.CLOSE;
		} else {
			return State.OPEN;
		}
	}
	
	private static enum State {
		OPEN, CLOSE
	}
	
}
