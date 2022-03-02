package kh.thread;

public class MyThread extends Thread {
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
			try {
				sleep(100);
			} catch (InterruptedException e) {

			}
		}
	}
}
