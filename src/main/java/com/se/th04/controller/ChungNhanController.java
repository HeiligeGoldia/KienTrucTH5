package com.se.th04.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.th04.service.ChungNhanServiceImpl;

@RestController
@RequestMapping("/api/chungNhan")
public class ChungNhanController {
	
	@Autowired
	ChungNhanServiceImpl cnserv;
	
	@GetMapping("/cau9")
	public List<String> cau9() {
		return cnserv.cau9();
	}

}
