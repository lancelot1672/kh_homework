package kh.thread.syncronization;

public class Account {
	private int balance = 2000;
	
	public Account() {
		
	}
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	/*
	 * 출금
	 *  - 여러 쓰레드에 의해 호출
	 *   - 현재 balance 필드에서 전달된 money 만큼 차감처리
	 *   
	 *   
	 *   동기화처리
	 *    - 동기화대상은 늘 특정객체가 된다.
	 *    1. 동기화 메서드 처리 - acc.withDraw() acc가 동기화 대상이 된다. 
	 *   		public synchronized void withDraw(int money)
	 *    2. 동기화 블럭 메서드 안에 생성
	 * 			synchronized()
	 */
	public void withDraw(int money) {
		synchronized(this) {
			String threadName = Thread.currentThread().getName();
			System.out.printf("[%s] 출금시도 %d, 현재 잔액 %d원\n",threadName, money, this.balance);
			if (money <= balance) {
				this.balance -= money;
				System.out.printf("[%s] 출금성공 => 현재잔액 %d원 \n", threadName, this.balance);
			}else {
				System.out.printf("[%s] 출금실해 => 잔액이 부족합니다.\n", threadName);
				
			}
		}
	}
}
