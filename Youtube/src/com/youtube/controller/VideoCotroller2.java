package com.youtube.controller;

import com.youtube.model.Video;

public class VideoCotroller2 {
	
	
	Video[] videoList = new Video[5];
	int index = 0;
	
	
	public void videoUpload(Video video) {
		videoList[index++] = video;
		
		//return null;
	}

	
	public Video[] videoList() {
		
		return videoList;
	}

	
	public Video viewVideo(int index) {
		
		return videoList[index];
	}

	
	public void updateVideo(int index, Video video) {
		
		videoList[index] = video;
		
//		return null;
	}

	
	public void deleteVideio(int index) {
		videoList[index] = null;
//		return false;
	}
}
