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
			System.out.println(">> 메뉴선택 : ");
			int select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1:
				list = manager.selectList();
				printList(list);
				break;
			case 2:
				// 마지막에 새로운 음악 추가
				music = this.inputMusic();
				
				manager.addList(music);
				break;
			case 3:
				// 맨처음에 새로운 음악 추가
				music = this.inputMusic();
				manager.addAtZero(music);
				break;
			case 4:
				// 특정 곡을 삭제하는 메서드
				title = this.inputTitle();
				flag = manager.removeMusic(title);
				if(flag) {
					System.out.println("삭제가 완료되었습니다.");
				}
				break;
			case 5:
				//특정 곡을 바꾸는 메서드
				Music oldMusic = new Music("김동률","기억의 습작");
				Music newMusic = new Music("박효신", "야생화");
				
				flag = manager.replaceMusic(oldMusic, newMusic);
				if(flag) {
					System.out.println("곡 변경이 완료되었습니다.");
				}
				break;
			case 6:
				//특정 곡이 있는지 검사
				title = this.inputTitle();
				
				list = manager.searchMusicByTitle(title);
				this.printList(list);
				break;
			case 7:
				//가수 명으로 검색 메서드
				singer = this.inputSinger();
				
				list = manager.searchMusicBySinger(singer);
				this.printList(list);
				break;
			case 8:
				//서브 메뉴 - 각 정렬 메서드
				this.sortMenu();
				break;
			}
			
		}
	}
	public void printMenu() {
		System.out.println("=============== Music PlayList Menu ===============");
		System.out.println("1. 목록보기");
		System.out.println("2. 마지막에 음악추가");
		System.out.println("3. 맨처음에 음악추가");
		System.out.println("4. 곡삭제");
		System.out.println("5. 곡변경");
		System.out.println("6. 곡명검색");
		System.out.println("7. 가수검색");
		System.out.println("8. 목록정렬(곡명오름차순)");
		System.out.println("0. 종료");
		System.out.println("========================================");
	}
	public void sortMenu() {
		boolean bool = true;
		do {
		System.out.println("=============== 정렬 메뉴 ===============");
		System.out.println("1. 가수명 오름차순");
		System.out.println("2. 가수명 내림차순");
		System.out.println("3. 곡명 오름차순");
		System.out.println("4. 곡명 내림차순");
		System.out.println("5. 메인메뉴 돌아가기");
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
	//리스트 출력메서도
	public void printList(List<Music> list) {
		try {
			for(int i=0; i<list.size(); i++) {
				Music m = list.get(i);
				String title = m.getTitle();
				String singer = m.getSinger();
				System.out.printf("곡 : %s, 아티스트 : %s\n",title,singer);
			}
		}catch(Exception e) {
			e.getMessage();
		}

	}
	// 곡명 입력메소드
	public String inputTitle() {
		System.out.print("타이틀 :: ");
		String title = sc.nextLine();
		
		return title;
	}
	//가수 입력메소드
	public String inputSinger() {
		System.out.print("가수 :: ");
		String singer = sc.nextLine();
		
		return singer;
	}
	// 음악 입력 메소드
	public Music inputMusic() {

		
		System.out.print("가수 :: ");
		String singer = sc.nextLine();
		
		System.out.print("타이틀 :: ");
		String title = sc.nextLine();
		
		Music m = new Music(singer, title);
		
		return m;
	}
}
