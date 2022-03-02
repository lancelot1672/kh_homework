package kh.thread.syncronization;

public class ATMThread implements Runnable{
	private Account acc;
	
	public ATMThread (Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(acc.getBalance() > 0) {
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withDraw(money);  //출금
			
		}
		System.out.println("[" + Thread.currentThread() + "종료]");
	}
	
}
