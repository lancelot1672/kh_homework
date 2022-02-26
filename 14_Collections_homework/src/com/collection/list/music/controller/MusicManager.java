package com.collection.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.collection.list.model.vo.Music;

public class MusicManager{
	private ArrayList<Music> musicList = new ArrayList<Music>();
	{
			musicList.add(new Music("쏜애플","서울"));
			musicList.add(new Music("설","열기구"));
			musicList.add(new Music("V","Christmas Tree"));
			musicList.add(new Music("김동률","기억의 습작"));
			musicList.add(new Music("데이식스","한 페이지가 될 수 있게"));
	};
	
	//음악리스트 리턴
	public List<Music> selectList() {
		
		return musicList;
	}
	//마지막에 음악추가
	public void addList(Music m) {
		musicList.add(m);
	}
	// 맨 처음에 음악추가
	public void addAtZero(Music m) {
		musicList.add(0, m);
	}
	//특정곡을 삭제하는 메소드
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
	//특정 곡을 바꾸는 메서드
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
	//가수명으로 검색 메소드
	public List<Music> searchMusicBySinger(String singer){
		List<Music> list = new ArrayList<>();
		for(int i=0; i<musicList.size(); i++) {
			if(musicList.get(i).getSinger().equals(singer)) {
				list.add(musicList.get(i));
			}
		}
		return list;
	}
	//곡 명으로 검색 메서드
	public List<Music> searchMusicByTitle(String title){
		List<Music> list = new ArrayList<>();
		for(int i=0; i<musicList.size(); i++) {
			if(musicList.get(i).getTitle().equals(title)) {
				list.add(musicList.get(i));
			}
		}
		return list;
	}
	
	// 가수명 오름차순
	public void ascendingBySinger() {
		Collections.sort(musicList, new MusicSingerComparator());
	}
	// 가수명 내림차순
	public void descendingBySinger() {
		Collections.sort(musicList, new MusicSingerComparator().reversed());
	}
	// 곡명 오름차순
	public void ascendingByTitle() {
		Collections.sort(musicList, new MusicTitleComparator());
	}
	// 곡명 내림차순
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