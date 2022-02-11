package net.kh.member.run;

import net.kh.member.model.Member;

public class Run {
//	public static void main(String[] args) {
//		
//		Member m1 = new Member();
//		
//		m1.setMemberName("±èµ¿·ü");
//		m1.setMemberId("abc123");
//		m1.setMemberPwd("1234");
//		m1.setAge(26);
//		m1.setGender('³²');
//		m1.setPhone("010-1111-2222");
//		m1.setEmail("abc123@naver.com");
//		
//		System.out.println(m1.getMemberId());
//		System.out.println(m1.getMemberPwd());
//		System.out.println(m1.getMemberName());
//		System.out.println(m1.getGender());
//		System.out.println(m1.getAge());
//		System.out.println(m1.getPhone());
//		System.out.println(m1.getEmail());
//	}
	public static void main(String[] args) {
		for(int i = 1; i<= 5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
