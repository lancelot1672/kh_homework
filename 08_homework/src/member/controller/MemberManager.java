package member.controller;

import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.Vip;
import member.model.vo.Vvip;

public class MemberManager {
	private Silver[] s = new Silver[10];
	private Gold[] g = new Gold[10];
	private Vip[] v = new Vip[10];
	private Vvip[] vv = new Vvip[10];
	
	private int silver_index = 0;
	private int gold_index = 0;
	private int vip_index = 0;
	private int vvip_index = 0;
	
	public void silverInsert(Silver silver) {
		this.s[this.silver_index] = silver;
		silver_index+=1;
	}
	public void goldInsert(Gold gold) {
		this.g[this.gold_index] = gold;
		gold_index+=1;
	}
	public void vipInsert(Vip vip) {
		this.v[this.vip_index] = vip;
		vip_index += 1;
	}
	public void vvipInsert(Vvip vvip) {
		this.vv[this.vvip_index] = vvip;
		vvip_index += 1;
	}
	
	public void printData() {
		System.out.println("------------------------------<<ȸ������>>-------------------------------");
		System.out.println("�̸�               ���                       ����Ʈ               ��������Ʈ");
		System.out.println("-----------------------------------------------------------------------");
		
		// Silver ���
		for(int i=0; i<silver_index; i++) {
			String name = this.s[i].getName();
			String grade = this.s[i].getGrade();
			int point = this.s[i].getPoint();
			double p_point = this.s[i].getPlus_point();
			
			System.out.printf("%s            %s                      %d               %.2f\n",name, grade, point, p_point);
		}
		
		// Gold ���
		for(int i=0; i<gold_index; i++) {
			String name = this.g[i].getName();
			String grade = this.g[i].getGrade();
			int point = this.g[i].getPoint();
			double p_point = this.g[i].getPlus_point();
			
			System.out.printf("%s            %s                        %d               %.2f\n",name, grade, point, p_point);
		}
		// Vip ���
		for(int i=0; i<vip_index; i++) {
			String name = this.v[i].getName();
			String grade = this.v[i].getGrade();
			int point = this.v[i].getPoint();
			double p_point = this.v[i].getPlus_point();
			
			System.out.printf("%s            %s                        %d               %.2f\n",name, grade, point, p_point);
		}
		
		// VVip ���
		for(int i=0; i<vvip_index; i++) {
			String name = this.vv[i].getName();
			String grade = this.vv[i].getGrade();
			int point = this.vv[i].getPoint();
			double p_point = this.vv[i].getPlus_point();
			
			System.out.printf("%s            %s                      %d               %.2f\n",name, grade, point, p_point);
		}

	}
}
