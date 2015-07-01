package com.mayank.thread.semaphore;

public class Main {

	public static BasicSemaphore lock = new BasicSemaphore();
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new Runnable() {

				@Override
				public void run() {
					runnnn(getRunnable());
				}
			});
			t.setName("Thread-t" + (i+1));
			t.start();
		}

		System.out.println("-------------------------------DONE-------------------------------");
	}

	private static void runnnn(Runnable runnable) {
		lock.aquireLock();
		if (runnable != null) {
			runnable.run();
		}
		lock.releaseLock();
	}

	private static Runnable getRunnable() {
		return new Runnable() {
			public void run() {
				try {
					Thread.sleep(0);
					//System.out.println("Run ----  " + Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
	}
}
