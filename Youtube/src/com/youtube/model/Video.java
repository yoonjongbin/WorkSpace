package com.youtube.model;

import java.sql.Date;
import java.util.List;

public class Video {
	
	private Date uploadAt;
	private int views;
	private String title;
	private String comment;
	private String imgUrl;
	private String fileUrl;

	private String desc;
	private char kind; // shorts & video 둘 중 하나
	
	private List<Comment> comments;
	private Category category;
	
	
	
	public Video() {
	}



	public Video(String title, String comment, String imgUrl, String fileUrl, Date uploadAt, int views) {
		this.title = title;
		this.comment = comment;
		this.imgUrl = imgUrl;
		this.fileUrl = fileUrl;
		this.uploadAt = uploadAt;
		this.views = views;
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
		return views;
	}



	public void setCount(int views) {
		this.views = views;
	}



	@Override
	public String toString() {
		return "Video [title=" + title + ", comment=" + comment + ", imgUrl=" + imgUrl + ", fileUrl=" + fileUrl
				+ ", uploadAt=" + uploadAt + ", count=" + views + "]";
	}
	
	
	
	
	
	
	
}
