package com.kh.practice1.compare;

import java.util.Comparator;

import com.kh.practice1.model.Music;

public class ArtistAscending  implements Comparator<Music>{
	
	@Override
	public int compare(Music o1, Music o2) {
		return o1.getSinger().compareTo(o2.getSinger());
	}
}
