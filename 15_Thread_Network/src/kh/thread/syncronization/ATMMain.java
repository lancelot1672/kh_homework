package kh.thread.syncronization;

public class ATMMain {
	public static void main(String[] args) {
		Account acc = new Account();
		Thread t1 = new Thread(new ATMThread(acc), "ATM1");
		Thread t2 = new Thread(new ATMThread(acc), "ATM2");
		
		t1.start();
		t2.start();
	}
}
