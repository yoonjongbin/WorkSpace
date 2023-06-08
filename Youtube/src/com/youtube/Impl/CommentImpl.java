package com.youtube.Impl;


import com.youtube.model.Comment;


public interface CommentImpl {
	// C : 댓글 작성 --> 로그인 된 회원만 가능
	public void addComment(String id, String password, Comment comments);
	// R : 댓글 보기
	public Comment viewComment(int index);
	// U : 댓글 수정 --> 로그인한 회원과 이 댓글을 작성한 작성자가 일치
	public void updateComment(int index, Comment comment);
	
	// D : 댓글 삭제 --> 로그인한 회원과 이 댓글을 작성한 작성자가 일치
	public void deleteComment(int index);
}
