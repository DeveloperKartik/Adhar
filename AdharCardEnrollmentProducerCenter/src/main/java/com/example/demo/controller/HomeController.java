package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.adhar.Adhar;

@RestController
@RequestMapping("/api")
public class HomeController {
	
	@GetMapping("/producerAdhar")
	public List<Adhar> findAllAdhar() {
		List<Adhar> aList = new ArrayList<Adhar>();

		Adhar a1 = new Adhar();
		a1.setAdharNo(101);
		a1.setaName("Kartik");
		a1.setaDob("17/11/1993");
		a1.setAddress("Amravati");
		a1.setMobileNo("9096643789");

		Adhar a2 = new Adhar();
		a2.setAdharNo(102);
		a2.setaName("Akash");
		a2.setaDob("10/02/1993");
		a2.setAddress("Pune");
		a2.setMobileNo("9069001010");

		Adhar a3 = new Adhar();
		a3.setAdharNo(103);
		a3.setaName("Shubham");
		a3.setaDob("02/02/1994");
		a3.setAddress("Mumbai");
		a3.setMobileNo("8956890708");

		aList.add(a1);
		aList.add(a2);
		aList.add(a3);

		return aList;
	}
}
