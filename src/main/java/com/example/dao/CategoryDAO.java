package com.example.dao;

import java.util.HashMap;
import java.util.List;

import com.example.domain.CategoryVO;

public interface CategoryDAO {
	public void insert(CategoryVO vo);
	public List<HashMap<String, Object>> list(String user);
}
