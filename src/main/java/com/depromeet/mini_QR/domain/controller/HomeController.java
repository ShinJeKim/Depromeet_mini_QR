package com.depromeet.mini_QR.domain.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
	
	@GetMapping(value = "/")
    public String index(HttpServletRequest req, HttpServletResponse res) {
        return "home";
    }
	
	@PostMapping(value = "/seminar/{seminarId}")
	public String setSeminarName(HttpServletRequest req, HttpServletResponse res){
		String seminarName = req.getParameter("seminarName");
		
		return seminarName;
	}
}