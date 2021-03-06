package com.depromeet.mini_QR.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.depromeet.mini_QR.domain.dto.CommentDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	Long commentId;
	
	@Column(nullable = false)
	String content;
	
	@Builder.Default
	Integer likeCount=0;
	
	@ManyToOne
	@JoinColumn(name = "seminarRoom")
	SeminarRoom seminarRoom;
	
	public CommentDto toDto() {
	      return CommentDto.builder()
	            .commentId(commentId)
	            .content(content)
	            .likeCount(likeCount)
	            .seminarRoom(seminarRoom)
	            .build();
	   }
}