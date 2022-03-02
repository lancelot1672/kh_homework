package kh.thread;

public class GuguThread implements Runnable{
	private int dan;
	public GuguThread(int dan) {
		this.dan = dan;
	}
	public void run() {
		 for(int i = 1; i < 10; i++) {
	            System.out.printf("%d * %d = %d%n", dan, i, dan*i);
	            try {
	                Thread.sleep(700);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	}
	
}
