package com.kh.practice1.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.practice1.compare.ArtistAscending;
import com.kh.practice1.compare.TitleAscending;
import com.kh.practice1.model.Music;

public class MusicController {
	private ArrayList<Music> list = new ArrayList();
	
	public boolean addList(Music music) {
		
		list.add(music);
		if(!list.isEmpty())
			return true;
		
		return false;
	}
	
	public boolean addAtZero(Music music) {
		list.set(0, music);
		if(list.get(0) == music) {
			return true;
		}
		
		return false;
	}
	
	public ArrayList<Music> printAll() {
		return this.list;
	}
	
	public Music searchMusic(String title) {
		
		for(Music i : this.list) {
			if(i.getTitle().equals(title))
				return i;
		}
		
		return null;
		
	}
	
	public Music removeMusic(String title) {
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				return list.remove(i);
			}
				
		}
		
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		
		Music musicSearch = searchMusic(title);
			
		if(musicSearch != null)
			for(int i = 0; i < list.size(); i++) {
				if(musicSearch.getTitle().equals(list.get(i).getTitle())) {
					return list.set(i, music);
				}
					
			}
		
		
		return null;
	}
	
	public ArrayList<Music> ascTitle(){
		ArrayList<Music> list = (ArrayList<Music>) this.list.clone();
		
		// 오름차순 
		
		Collections.sort(list, new TitleAscending());
		
		return list;
	}
	
	public ArrayList<Music> descArtist(){
		ArrayList<Music> list = (ArrayList<Music>) this.list.clone();
		
		Collections.sort(list, new ArtistAscending().reversed());
		
		return list;
	}
}
