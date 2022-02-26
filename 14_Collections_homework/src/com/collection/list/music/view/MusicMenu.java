package com.collection.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.collection.list.model.vo.Music;
import com.collection.list.music.controller.MusicManager;

public class MusicMenu {
	private Scanner sc = new Scanner(System.in);
	private MusicManager manager = new MusicManager();
	
	public MusicMenu() {
		Music music;
		String title= "";
		String singer = "";
		boolean flag = false;
		
		List<Music> list = null;
		while(true) {
			printMenu();
			System.out.println(">> �޴����� : ");
			int select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1:
				list = manager.selectList();
				printList(list);
				break;
			case 2:
				// �������� ���ο� ���� �߰�
				music = this.inputMusic();
				
				manager.addList(music);
				break;
			case 3:
				// ��ó���� ���ο� ���� �߰�
				music = this.inputMusic();
				manager.addAtZero(music);
				break;
			case 4:
				// Ư�� ���� �����ϴ� �޼���
				title = this.inputTitle();
				flag = manager.removeMusic(title);
				if(flag) {
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				}
				break;
			case 5:
				//Ư�� ���� �ٲٴ� �޼���
				Music oldMusic = new Music("�赿��","����� ����");
				Music newMusic = new Music("��ȿ��", "�߻�ȭ");
				
				flag = manager.replaceMusic(oldMusic, newMusic);
				if(flag) {
					System.out.println("�� ������ �Ϸ�Ǿ����ϴ�.");
				}
				break;
			case 6:
				//Ư�� ���� �ִ��� �˻�
				title = this.inputTitle();
				
				list = manager.searchMusicByTitle(title);
				this.printList(list);
				break;
			case 7:
				//���� ������ �˻� �޼���
				singer = this.inputSinger();
				
				list = manager.searchMusicBySinger(singer);
				this.printList(list);
				break;
			case 8:
				//���� �޴� - �� ���� �޼���
				this.sortMenu();
				break;
			}
			
		}
	}
	public void printMenu() {
		System.out.println("=============== Music PlayList Menu ===============");
		System.out.println("1. ��Ϻ���");
		System.out.println("2. �������� �����߰�");
		System.out.println("3. ��ó���� �����߰�");
		System.out.println("4. �����");
		System.out.println("5. ���");
		System.out.println("6. ���˻�");
		System.out.println("7. �����˻�");
		System.out.println("8. �������(����������)");
		System.out.println("0. ����");
		System.out.println("========================================");
	}
	public void sortMenu() {
		boolean bool = true;
		do {
		System.out.println("=============== ���� �޴� ===============");
		System.out.println("1. ������ ��������");
		System.out.println("2. ������ ��������");
		System.out.println("3. ��� ��������");
		System.out.println("4. ��� ��������");
		System.out.println("5. ���θ޴� ���ư���");
		System.out.println("========================================");
		int select = sc.nextInt();
		
		switch(select) {
		case 1:
			manager.ascendingBySinger();
			break;
		case 2:
			manager.descendingBySinger();
			break;
		case 3:
			manager.ascendingByTitle();
			break;
		case 4:
			manager.descendingByTitle();
			break;
		case 5:
			bool = false;
			break;
		}
		}while(bool);
	}
	//����Ʈ ��¸޼���
	public void printList(List<Music> list) {
		try {
			for(int i=0; i<list.size(); i++) {
				Music m = list.get(i);
				String title = m.getTitle();
				String singer = m.getSinger();
				System.out.printf("�� : %s, ��Ƽ��Ʈ : %s\n",title,singer);
			}
		}catch(Exception e) {
			e.getMessage();
		}

	}
	// ��� �Է¸޼ҵ�
	public String inputTitle() {
		System.out.print("Ÿ��Ʋ :: ");
		String title = sc.nextLine();
		
		return title;
	}
	//���� �Է¸޼ҵ�
	public String inputSinger() {
		System.out.print("���� :: ");
		String singer = sc.nextLine();
		
		return singer;
	}
	// ���� �Է� �޼ҵ�
	public Music inputMusic() {

		
		System.out.print("���� :: ");
		String singer = sc.nextLine();
		
		System.out.print("Ÿ��Ʋ :: ");
		String title = sc.nextLine();
		
		Music m = new Music(singer, title);
		
		return m;
	}
}
