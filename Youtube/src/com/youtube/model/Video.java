package com.youtube.model;

import java.sql.Date;

public class Video {
	private String title;
	private String comment;
	private String imgUrl;
	private String fileUrl;
	
	private Date uploadAt;
	private int count;
	
	
	
	public Video() {
	}



	public Video(String title, String comment, String imgUrl, String fileUrl, Date uploadAt, int count) {
		this.title = title;
		this.comment = comment;
		this.imgUrl = imgUrl;
		this.fileUrl = fileUrl;
		this.uploadAt = uploadAt;
		this.count = count;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	public String getImgUrl() {
		return imgUrl;
	}



	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}



	public String getFileUrl() {
		return fileUrl;
	}



	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}



	public Date getUploadAt() {
		return uploadAt;
	}



	public void setUploadAt(Date uploadAt) {
		this.uploadAt = uploadAt;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	@Override
	public String toString() {
		return "Video [title=" + title + ", comment=" + comment + ", imgUrl=" + imgUrl + ", fileUrl=" + fileUrl
				+ ", uploadAt=" + uploadAt + ", count=" + count + "]";
	}
	
	
	
	
	
	
	
}
