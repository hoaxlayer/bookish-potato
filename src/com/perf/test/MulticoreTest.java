package com.perf.test;

public class MulticoreTest {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		long endTime;
		int availableThreads;

		availableThreads = Runtime.getRuntime().availableProcessors();
		System.out.println("Available hardware threads: " + availableThreads);
		
		ThreadGroup threadGroup = new ThreadGroup("hwThreads");
		
		while(availableThreads>0) {
			
			Thread t = new Thread (threadGroup, String.valueOf(availableThreads));
			
			availableThreads--;
		}
		
		//TODO Add core logic
		
		endTime = System.currentTimeMillis();
		System.out.println("Total time: " + (endTime-startTime*1.0));
		
	}

}
