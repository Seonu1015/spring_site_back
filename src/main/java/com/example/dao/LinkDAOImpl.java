package com.example.dao;

import java.util.*;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.LinkVO;

@Repository
public class LinkDAOImpl implements LinkDAO {
	@Autowired
	SqlSession session;
	
	String namespace="com.example.mapper.LinkMapper";

	@Override
	public List<HashMap<String, Object>> listAll(String user) {
		return session.selectList(namespace + ".list_all", user);
	}

	@Override
	public void insert(LinkVO vo) {
		session.insert(namespace + ".insert", vo);
	}

	@Override
	public HashMap<String, Object> read(int linkId) {
		return session.selectOne(namespace + ".read", linkId);
	}

	@Override
	public void update(LinkVO vo) {
		session.update(namespace + ".update", vo);
	}

	@Override
	public void delete(int linkId) {
		session.delete(namespace + ".delete", linkId);
	}

	@Override
	public List<HashMap<String, Object>> listFlt(LinkVO vo) {
		return session.selectList(namespace + ".list_flt", vo);
	}

}
