package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.CategoryVO;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	SqlSession session;
	
	String namespace="com.example.mapper.CategoryMapper";

	@Override
	public void insert(CategoryVO vo) {
		session.insert(namespace + ".insert", vo);
	}

	@Override
	public List<HashMap<String, Object>> list(String user) {
		return session.selectList(namespace + ".list", user);
	}

	@Override
	public void update(CategoryVO vo) {
		session.update(namespace + ".update", vo);
	}

	@Override
	public void delete(int categoryId) {
		session.delete(namespace + ".delete", categoryId);
	}

	@Override
	public int check(CategoryVO vo) {
		return session.selectOne(namespace + ".total", vo);
	}

}
