package com.kh.practice1.model;

public class Music {
	
	private String title;
	private String artist;
	
	
	
	public Music() {
	}
	
	
	public Music(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getSinger() {
		return artist;
	}


	public void setSinger(String artist) {
		this.artist = artist;
	}


	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}
	
	
	
	
}
