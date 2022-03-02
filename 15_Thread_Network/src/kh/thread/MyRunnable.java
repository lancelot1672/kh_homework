package kh.thread;

public class MyRunnable implements Runnable{
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
		}
	}

}
