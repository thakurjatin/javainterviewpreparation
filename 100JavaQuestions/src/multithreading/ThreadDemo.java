package multithreading;

import java.util.Iterator;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main Thread Name =>" + Thread.currentThread().getName());
		
		Thread thread = new JavaThread();
		thread.setName("Java Thread");
		thread.start();
		
		Thread thread2 = new PythonThread();
		thread2.setName("Python Thread");
		thread2.start();
		
		Thread thread3 = new CThread();
		thread3.setName("C Thread");
		thread3.start();
		
		
//		new Thread(() ->{
//			System.out.println("Staring Thread:" + Thread.currentThread().getName());
//			for (int i = 0; i < 10; i++) {
//				System.out.println("Java Programming");
//				try {
//					Thread.sleep(200);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			System.out.println("Finishing Thread:" + Thread.currentThread().getName());
//
//		}, "Java").start();
//		
//		new Thread(() ->{
//			System.out.println("Staring Thread:" + Thread.currentThread().getName());
//			for (int i = 0; i < 12; i++) {
//				System.out.println("Python Programming");
//				try {
//					Thread.sleep(200);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}	
//			}
//			System.out.println("Finish Thread:" + Thread.currentThread().getName());
//
//		}, "Python").start();
//		
//		new Thread(() ->{
//			System.out.println("Staring Thread:" + Thread.currentThread().getName());
//			for (int i = 0; i < 10; i++) {
//				System.out.println("C Programming");
//				try {
//					Thread.sleep(200);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//			}
//			System.out.println("Finish Thread:" + Thread.currentThread().getName());
//
//		}, "C").start();
//		
//		
//		
//		
//		
//		//sequencial thread
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Java Programming");
//			Thread.sleep(100);
//		}
//		for (int i = 0; i < 12; i++) {
//			System.out.println("Python Programming");
//			Thread.sleep(100);
//
//			
//		}
//		for (int i = 0; i < 10; i++) {
//			System.out.println("C Programming");
//			Thread.sleep(100);
//
//		}
	}

}
