package com.journaldev.threads;

public class Singleton {

	private Singleton() {

	}

	private static class SingletonHolder {
		private final static Singleton instance = new Singleton();
	}

	public Singleton getInstance() {
		return SingletonHolder.instance;
	}

}
