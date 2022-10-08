package com.se.th04.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.th04.service.MayBayServiceImpl;

@RestController
@RequestMapping("/api/mayBay")
public class MayBayController {
	
	@Autowired
	private MayBayServiceImpl mbserv;
	
	@GetMapping("/cau2")
	public List<String> cau2() {
		return mbserv.cau2();
	}
	
	@GetMapping("/cau7")
	public int cau7() {
		return mbserv.cau7();
	}
	
	@GetMapping("/cau11")
	public List<String> cau11() {
		return mbserv.cau11();
	}
	
	@GetMapping("/cau13")
	public List<String> cau13() {
		return mbserv.cau13();
	}
	
	@GetMapping("/cau16")
	public List<Object[]> cau16() {
		return mbserv.cau16();
	}

}
