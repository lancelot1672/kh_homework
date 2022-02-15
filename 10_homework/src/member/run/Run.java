package member.run;

import member.controller.MemberManager;
import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.VVip;
import member.model.vo.Vip;

public class Run {
	public static void main(String[] args) {
		MemberManager m = new MemberManager();

		m.insertMember(new Silver("ȫ�浿", "Silver",1000));
		m.insertMember(new Silver("��浿", "Silver",2000));
		m.insertMember(new Silver("ȫ����", "Silver",3000));
		m.insertMember(new Gold("��ȸ��", "Gold",1000));
		m.insertMember(new Gold("��ȸ��", "Gold",2000));
		m.insertMember(new Gold("��ȸ��", "Gold",3000));
		m.insertMember(new Vip("�̼���", "Vip",10000));
		m.insertMember(new VVip("�Ż��Ӵ�", "VVip",100000));
		m.printData();
	}
}
