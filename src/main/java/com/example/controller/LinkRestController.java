package com.example.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.LinkDAO;
import com.example.domain.LinkVO;

@RestController
@RequestMapping("/link")
public class LinkRestController {
	@Autowired
	LinkDAO dao;
	
	@GetMapping("/list")
	public List<HashMap<String, Object>> listAll(@RequestParam("user") String user) {
		return dao.listAll(user);
	}
	
	@GetMapping("/read")
	public HashMap<String, Object> read(@RequestParam("linkId") int linkId) {
		return dao.read(linkId);
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody LinkVO vo) {
		dao.insert(vo);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody LinkVO vo) {
		dao.update(vo);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody int linkId) {
		dao.delete(linkId);
	}
}
