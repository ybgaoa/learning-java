package com.thread.sample.sample11;
/**
 * 信号量
如果线程要访问一个共享资源，它必须先获取信号量。如果信号量的内部计数器大于0，信号量将减1，然后允许访问这个共享资源。计数器大于0意味着可以使用的资源，因此线程将被允许使用其中一个资源。
否则，如果信号量的计数器等于0，信号量将会把线程置入休眠直至计数器大于0。计数器等于0的时候意味着所有的共享资源已经被其他线程使用了，所以需要访问这个共享资源的线程必须等待。
当线程使用完某个共享资源时，信号量必须被释放，以便其他线程能够访问共享资源。释放操作将使信号量的内部计数器增加1。
信号量实现临界区必须遵循的三个步骤，从而保护对共享资源的访问：
首先，必须通过acquire()方法获取信号量；
其次，使用共享资源执行必要的操作；
最后，必须通过release()方法释放信号量。
信号量的公平性
Semaphore类的构造器提供了第二个传入参数。这个参数是boolean型的。如果传入false值，那么创建的信号量就是非公平模式的，与不使用这个参数的效果一样。如果传入true值，那么创建的信号量是公平模式的。
 * @author ybgaoa
 *
 */
public class Main {

	public static void main(String[] args) {
		PrintQueue printQueue = new PrintQueue();
		Thread thread[] = new Thread[10];
		for(int i=0;i<10;i++){
			thread[i] = new Thread(new Job(printQueue),"Thread-"+i);
		}
		for(int i=0;i<10;i++){
			thread[i].start();
		}
	}

}
