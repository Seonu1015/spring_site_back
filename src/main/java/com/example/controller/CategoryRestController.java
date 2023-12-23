package com.example.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.CategoryDAO;

@RestController
@RequestMapping("/cat")
public class CategoryRestController {
	@Autowired
	CategoryDAO dao;
	
	@GetMapping("/list")
	public List<HashMap<String, Object>> list(@RequestParam("user") String user) {
		return dao.list(user);
	}
}