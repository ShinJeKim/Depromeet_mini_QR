package com.depromeet.mini_QR.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SeminarRoom {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	Long seminarId;
	
	@Column(nullable = false)
	String seminarTitle;
	
	String fullURL;
	String shortURL;
}
