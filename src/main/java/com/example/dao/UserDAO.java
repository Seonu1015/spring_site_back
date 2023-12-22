package com.example.dao;

import java.util.*;

import com.example.domain.UserVO;

public interface UserDAO {
	public void insert(UserVO vo);
	public HashMap<String, Object> read(String email);
}
