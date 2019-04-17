package com.depromeet.mini_QR.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.depromeet.mini_QR.domain.entity.ChatRoom;
import com.depromeet.mini_QR.domain.entity.Comment;
@Transactional
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{
	public List<Comment> findBychatRoom(ChatRoom chatroom);

}