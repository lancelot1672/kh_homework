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
	 * ���
	 *  - ���� �����忡 ���� ȣ��
	 *   - ���� balance �ʵ忡�� ���޵� money ��ŭ ����ó��
	 *   
	 *   
	 *   ����ȭó��
	 *    - ����ȭ����� �� Ư����ü�� �ȴ�.
	 *    1. ����ȭ �޼��� ó�� - acc.withDraw() acc�� ����ȭ ����� �ȴ�. 
	 *   		public synchronized void withDraw(int money)
	 *    2. ����ȭ �� �޼��� �ȿ� ����
	 * 			synchronized()
	 */
	public void withDraw(int money) {
		synchronized(this) {
			String threadName = Thread.currentThread().getName();
			System.out.printf("[%s] ��ݽõ� %d, ���� �ܾ� %d��\n",threadName, money, this.balance);
			if (money <= balance) {
				this.balance -= money;
				System.out.printf("[%s] ��ݼ��� => �����ܾ� %d�� \n", threadName, this.balance);
			}else {
				System.out.printf("[%s] ��ݽ��� => �ܾ��� �����մϴ�.\n", threadName);
				
			}
		}
	}
}
