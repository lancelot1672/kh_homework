package com.collection.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.collection.list.model.vo.Music;

public class MusicManager{
	private ArrayList<Music> musicList = new ArrayList<Music>();
	{
			musicList.add(new Music("�����","����"));
			musicList.add(new Music("��","���ⱸ"));
			musicList.add(new Music("V","Christmas Tree"));
			musicList.add(new Music("�赿��","����� ����"));
			musicList.add(new Music("���̽Ľ�","�� �������� �� �� �ְ�"));
	};
	
	//���Ǹ���Ʈ ����
	public List<Music> selectList() {
		
		return musicList;
	}
	//�������� �����߰�
	public void addList(Music m) {
		musicList.add(m);
	}
	// �� ó���� �����߰�
	public void addAtZero(Music m) {
		musicList.add(0, m);
	}
	//Ư������ �����ϴ� �޼ҵ�
	public boolean removeMusic(String s) {
		boolean check = false;
		
		for(int i=0; i<musicList.size(); i++) {
			String title = musicList.get(i).getTitle();
			if(title.equals(s)) {
				musicList.remove(i);
				check = true;
				break;
			}
		}
		return check;
	}
	//Ư�� ���� �ٲٴ� �޼���
	public boolean replaceMusic(Music oldMusic, Music newMusic) {
		boolean check = false;
		
		for(int i=0; i<musicList.size(); i++) {
			Music m = musicList.get(i);
			if(musicList.get(i).equals(oldMusic)){
				musicList.remove(i);
				musicList.add(i, newMusic);
				check = true;
				break;
			}
		}
		return check;
	}
	//���������� �˻� �޼ҵ�
	public List<Music> searchMusicBySinger(String singer){
		List<Music> list = new ArrayList<>();
		for(int i=0; i<musicList.size(); i++) {
			if(musicList.get(i).getSinger().equals(singer)) {
				list.add(musicList.get(i));
			}
		}
		return list;
	}
	//�� ������ �˻� �޼���
	public List<Music> searchMusicByTitle(String title){
		List<Music> list = new ArrayList<>();
		for(int i=0; i<musicList.size(); i++) {
			if(musicList.get(i).getTitle().equals(title)) {
				list.add(musicList.get(i));
			}
		}
		return list;
	}
	
	// ������ ��������
	public void ascendingBySinger() {
		Collections.sort(musicList, new MusicSingerComparator());
	}
	// ������ ��������
	public void descendingBySinger() {
		Collections.sort(musicList, new MusicSingerComparator().reversed());
	}
	// ��� ��������
	public void ascendingByTitle() {
		Collections.sort(musicList, new MusicTitleComparator());
	}
	// ��� ��������
	public void descendingByTitle() {
		Collections.sort(musicList, new MusicTitleComparator().reversed());
	}
}

class MusicTitleComparator implements Comparator<Music>{
	@Override
	public int compare(Music o1, Music o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}
	
}
class MusicSingerComparator implements Comparator<Music>{
	@Override
	public int compare(Music o1, Music o2) {
		return o1.getSinger().compareTo(o2.getSinger());
	}
	
}