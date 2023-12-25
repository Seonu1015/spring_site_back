package com.example.dao;

import java.util.HashMap;
import java.util.List;

import com.example.domain.CategoryVO;

public interface CategoryDAO {
	public List<HashMap<String, Object>> list(String user);
	public int check(CategoryVO vo);
	public void insert(CategoryVO vo);
	public void update(CategoryVO vo);
	public void delete(int categoryId);
}
