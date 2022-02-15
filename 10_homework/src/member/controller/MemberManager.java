package member.controller;

import member.model.vo.Member;

public class MemberManager {
	Member[] member = new Member[40];
	private int m_Index = 0; 
	public void insertMember(Member m) {
		member[m_Index] = m;
		m_Index++;
	}
	public void printData() {
		System.out.println("------------------------------<<ȸ������>>-------------------------------");
		System.out.println("�̸�               ���                       ����Ʈ               ��������Ʈ");
		System.out.println("-----------------------------------------------------------------------");
		
		// Silver ���
		for(int i=0; i<m_Index; i++) {
			String name = this.member[i].getName();
			String grade = this.member[i].getGrade();
			int point = this.member[i].getPoint();
			double p_point = this.member[i].getPlus_point();
			
			System.out.printf("%s            %s                      %d               %.2f\n",name, grade, point, p_point);
		}

	}
}
