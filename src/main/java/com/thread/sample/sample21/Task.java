package com.thread.sample.sample21;

import java.util.concurrent.Callable;
//创建任务类
public class Task implements Callable<String> {

	@Override
	public String call() throws Exception {
		while(true){
			System.out.println("task test");
			Thread.sleep(1000);
		}
	}

}
