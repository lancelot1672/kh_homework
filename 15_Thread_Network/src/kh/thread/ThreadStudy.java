package kh.thread;

import java.util.Scanner;

public class ThreadStudy {
	public static void main(String[] args) {
		ThreadStudy study = new ThreadStudy();
		study.test4();
	}
	/*
	 * 	�ϳ��� ���μ��� - �ϳ��� ������ (main)
	 * */
	private void test1() {
		
	}
	/*
	 * 		�ϳ��� ���η��� - ��Ƽ ������
	 * 
	 * 		������ ��ü�� ����� ���
	 * 		1. Thread ��� Ŭ����
	 * 		2. Runnable ���� Ŭ����		<< �긦 ���� ��
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
		
		// Override�� run�� �ƴ� start�� ȣ���ؾ� ���ο� CallStack���� �۾��� ���۵ȴ�.
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
