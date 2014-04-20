package com.journaldev.threads;

import java.util.Arrays;

public class SynchronizedMethod {
	public static void main(String[] args) throws InterruptedException {
		String[] arr = { "1", "2", "3", "4", "5", "6" };
		HashMapProcessor hmd = new HashMapProcessor(arr);
		Thread t1 = new Thread(hmd, "t1");
		Thread t2 = new Thread(hmd, "t2");
		Thread t3 = new Thread(hmd, "t3");

		long start = System.currentTimeMillis();

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();

		long duration = System.currentTimeMillis() - start;
		System.out.println("Taken time " + duration);
		System.out.println(Arrays.asList(arr));

	}
}
