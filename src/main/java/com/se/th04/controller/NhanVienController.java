package com.se.th04.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.th04.entity.NhanVien;
import com.se.th04.service.NhanVienServiceImpl;

@RestController
@RequestMapping("/api/nhanVien")
public class NhanVienController {
	
	@Autowired
	NhanVienServiceImpl nvserv;
	
	@GetMapping("/cau3")
	public List<NhanVien> cau3() {
		return nvserv.cau3();
	}
	
	@GetMapping("/cau8")
	public int cau8() {
		return nvserv.cau8();
	}
	
	@GetMapping("/cau10")
	public List<NhanVien> cau10() {
		return nvserv.cau10();
	}
	
	@GetMapping("/cau12")
	public List<String> cau12() {
		return nvserv.cau12();
	}
	
	@GetMapping("/cau15")
	public List<String> cau15() {
		return nvserv.cau15();
	}
	
	@GetMapping("/cau22")
	public List<String> cau22() {
		return nvserv.cau22();
	}
	
	@GetMapping("/cau23")
	public List<Object[]> cau23() {
		return nvserv.cau23();
	}
	
	@GetMapping("/cau24")
	public List<Object[]> cau24() {
		return nvserv.cau24();
	}
	
	@GetMapping("/cau25")
	public List<NhanVien> cau25() {
		return nvserv.cau25();
	}
	
	@GetMapping("/cau26")
	public List<String> cau26() {
		return nvserv.cau26();
	}
	
	@GetMapping("/cau27")
	public int cau27() {
		return nvserv.cau27();
	}

}
