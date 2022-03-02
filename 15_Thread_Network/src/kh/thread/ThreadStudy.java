package kh.thread;

import java.util.Scanner;

public class ThreadStudy {
	public static void main(String[] args) {
		ThreadStudy study = new ThreadStudy();
		study.test4();
	}
	/*
	 * 	하나의 프로세스 - 하나의 쓰레드 (main)
	 * */
	private void test1() {
		
	}
	/*
	 * 		하나의 프로레스 - 멀티 쓰레드
	 * 
	 * 		쓰레드 객체를 만드는 방법
	 * 		1. Thread 상속 클래스
	 * 		2. Runnable 구현 클래스		<< 얘를 많이 씀
	 * */
	private void test2() {
		MyThread mr = new MyThread();
		MyThread mr2 = new MyThread();
		mr.start();
		mr2.start();
	}
	private void test3() {
		Runnable run1 = new MyRunnable();
		Runnable run2 = new MyRunnable();
		
		Thread thread1 = new Thread(run1);
		Thread thread2 = new Thread(run2);
		
		// Override한 run이 아닌 start를 호출해야 새로운 CallStack에서 작업이 시작된다.
		thread1.start();
		thread2.start();
	}
	private void test4() {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		Runnable run1 = new GuguThread(dan);
		Runnable run2 = new GuguThread(dan+1);
		
		Thread t1 = new Thread(run1);
		Thread t2 = new Thread(run2);
		
		t1.start();
		t2.start();
	}
}
