package com.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	SqlSession session;
	
	String namespace="com.example.mapper.UsersMapper";

	@Override
	public void insert(UserVO vo) {
		session.insert(namespace + ".insert", vo);
	}

}
