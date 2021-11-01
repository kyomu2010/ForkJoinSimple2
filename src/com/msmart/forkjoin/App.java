package com.msmart.forkjoin;

import java.util.concurrent.ForkJoinPool;

import com.msmart.forkjoin.recursivetask.SimpleRecursiveTask;

public class App {

	public static void main(String[] args) {
		
		ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		
		//SimpleRecursiveTask task = new SimpleRecursiveTask(20);
		SimpleRecursiveTask task = new SimpleRecursiveTask(120);
		System.out.println(pool.invoke(task));
	}

}
