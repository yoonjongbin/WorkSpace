package com.youtube.controller;

import java.util.ArrayList;

import com.youtube.model.Video;

public class VideoCotroller2 {
	
	
//	Video[] videoList = new Video[5];
//	int index = 0;
//	
//	
//	public void videoUpload(Video video) {
//		videoList[index++] = video;
//		
//		//return null;
//	}
//
//	
//	public Video[] videoList() {
//		
//		return videoList;
//	}
//
//	
//	public Video viewVideo(int index) {
//		
//		return videoList[index];
//	}
//
//	
//	public void updateVideo(int index, Video video) {
//		
//		videoList[index] = video;
//		
////		return null;
//	}
//
//	
//	public void deleteVideio(int index) {
//		videoList[index] = null;
////		return false;
//	}
	
	
ArrayList<Video> videoList = new ArrayList<>();
	
	public void upload(Video video) { // 영상 업로드
		videoList.add(video);
	}

	public ArrayList<Video> videoList() { // 동영상 목록
		return videoList;
	}

	public Video viewVideo(int index) { // 동영상 1개 보기
		return videoList.get(index);
	}

	public void updateVideo(int index, Video video) {
		videoList.set(index, video);
	}

	public boolean deleteVideo(Video video) {
		return videoList.remove(video);
	}
}
