package com.collection.list.model.vo;

public class Music {
	private String title;
	private String singer;
	
	public Music() {
		
	}
	public Music(String singer, String title) {
		this.singer = singer;
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	
}
