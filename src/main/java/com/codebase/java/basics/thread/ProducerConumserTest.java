package com.codebase.java.basics.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConumserTest {
	
	private static class Queue {
		List<Integer> queues;
		int capcity;
		Lock lock = new ReentrantLock();
		Condition full = lock.newCondition();
		Condition empty = lock.newCondition();
		
		public Queue(int capcity) {
			this.queues = new ArrayList<>(capcity);
			this.capcity = capcity;
		}
		
		public void push(Integer num) {
			lock.lock();
			try {
				while(queues.size() == capcity) {
					full.await();
					System.out.println(Thread.currentThread().getName() + " push await, size:" + queues.size());
				}
				
				queues.add(num);
				empty.signal();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			finally {
				lock.unlock();
			}
		}
		
		public Integer pop() {
			lock.lock();
			Integer num = null;
			try {
				while(queues.size() == 0) {
					empty.await();
					System.out.println(Thread.currentThread().getName() + " pop await, size:" + queues.size());
				}
				
				num = queues.remove(0);
				full.signal();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			finally {
				lock.unlock();
			}
			return num;
		}
	}

	private static class Producer implements Runnable {
		Queue queue;
		public Producer(Queue queue) {
			this.queue = queue;
		}

		@Override
		public void run() {
			Random random = new Random();
			while(true) {
				int num = random.nextInt(10000);
				queue.push(num);
				System.out.println(Thread.currentThread().getName() + " Produce: " + num);
//				try {
//					Thread.sleep(4);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
		}

	}
	private static class Consumer implements Runnable {
		Queue queue;
		
		public Consumer(Queue queue) {
			this.queue = queue;
		}
		
		@Override
		public void run() {
			while(true) {
				System.out.println(Thread.currentThread().getName() + " Consume: " + queue.pop());
//				try {
//					Thread.sleep(2);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue(20);
		new Thread(new Producer(queue)).start();
		new Thread(new Producer(queue)).start();
		new Thread(new Producer(queue)).start();
		
		new Thread(new Consumer(queue)).start();
		new Thread(new Consumer(queue)).start();
	}

}
