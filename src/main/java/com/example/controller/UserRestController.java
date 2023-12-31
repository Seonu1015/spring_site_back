package com.example.controller;

import java.util.HashMap;

import org.apache.ibatis.ognl.ObjectNullHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserDAO;
import com.example.domain.UserVO;

@RestController
@RequestMapping("/user")
public class UserRestController {
	@Autowired
	UserDAO dao;
	
	@PostMapping("/insert")
	public void insert(@RequestBody UserVO vo) {
		dao.insert(vo);
	}
	
	@PostMapping("/login")
	public int login(@RequestBody UserVO vo) {
		int result = 0; // 아이디가 없는 경우
		HashMap<String, Object> user = dao.read(vo.getEmail());
		if(user != null ) {
			if(vo.getPassword().equals(user.get("password"))) {
				result = 1; // 아이디 비밀번호 일치
			} else {
				result = 2; // 비밀번호가 틀린 경우
			}
		}
		return result;
	}
}
