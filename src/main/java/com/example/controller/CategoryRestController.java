package com.example.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.CategoryDAO;
import com.example.dao.LinkDAO;
import com.example.domain.CategoryVO;

@RestController
@RequestMapping("/cat")
public class CategoryRestController {
	@Autowired
	CategoryDAO dao;
	
	@GetMapping("/list")
	public List<HashMap<String, Object>> list(@RequestParam("user") String user) {
		return dao.list(user);
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody CategoryVO vo) {
		dao.insert(vo);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody CategoryVO vo) {
		dao.update(vo);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody int categoryId) {
		dao.delete(categoryId);
	}
}
