package com.mayank.thread.semaphore;

public class Main {

	public static BasicSemaphore lock = new BasicSemaphore();
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			final int c = i;
			Thread t = new Thread(new Runnable() {

				@Override
				public void run() {
					runnnn(c);
				}
			});
			t.setName("Thread-t" + (i+1));
			t.start();
		}

		System.out.println("-------------------------------DONE-------------------------------");
	}

	private static void runnnn(int c) {
		lock.aquireLock();
		
		
		//Do your meaningfull work
		try {
			Thread.sleep((c+1)*(5000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		lock.releaseLock();
	}
}
