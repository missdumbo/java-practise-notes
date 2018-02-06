package com.codebase.java.basics.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProducerConumserTest2 {
	
	private static Object lock = new Object();
	
	private static List<Integer> list = new ArrayList<>();
	
	private static class Producer extends Thread {
		@Override
		public void run() {
			while (true) {
				synchronized (lock) {
					while(list.size() == 20) {
						try {
							lock.wait();
							System.out.println(Thread.currentThread().getName() + " producer wait");
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					Random random = new Random();
					int num = random.nextInt(10000);
					System.out.println(Thread.currentThread().getName() + " produce: " + num);
					list.add(num);
					lock.notify();
				}
			}
		}
	}
	
	private static class Consumer extends Thread {
		@Override
		public void run() {
			while(true) {
				synchronized (lock) {
					while(list.size() == 0) {
						try {
							System.out.println(Thread.currentThread().getName() + " consumer wait");
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(Thread.currentThread().getName() + " consume: " + list.remove(0));
					lock.notifyAll();
				}
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
//		new Producer().start();
		new Producer().start();
		
		new Consumer().start();
		new Consumer().start();
	}
}
