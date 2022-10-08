package com.se.th04.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.th04.entity.ChuyenBay;
import com.se.th04.service.ChuyenBayServiceImpl;

@RestController
@RequestMapping("/api/chuyenBay")
public class ChuyenBayController {
	
	@Autowired
	ChuyenBayServiceImpl cbserv;
	
	@GetMapping("/cau1")
	public List<ChuyenBay> cau1() {
		return cbserv.cau1();
	}
	
	@GetMapping("/cau4")
	public List<ChuyenBay> cau4() {
		return cbserv.cau4();
	}
	
	@GetMapping("/cau5")
	public List<ChuyenBay> cau5() {
		return cbserv.cau5();
	}
	
	@GetMapping("/cau6")
	public int cau6() {
		return cbserv.cau6();
	}
	
	@GetMapping("/cau14")
	public List<ChuyenBay> cau14() {
		return cbserv.cau14();
	}
	
	@GetMapping("/cau17")
	public List<ChuyenBay> cau17() {
		return cbserv.cau17();
	}
	
	@GetMapping("/cau18")
	public List<Object[]> cau18() {
		return cbserv.cau18();
	}
	
	@GetMapping("/cau19")
	public List<Object[]> cau19() {
		return cbserv.cau19();
	}
	
	@GetMapping("/cau20")
	public List<ChuyenBay> cau20() {
		return cbserv.cau20();
	}
	
	@GetMapping("/cau21")
	public List<Object[]> cau21() {
		return cbserv.cau21();
	}
	
	@GetMapping("/cau28")
	public List<ChuyenBay> cau28() {
		return cbserv.cau28();
	}

}
