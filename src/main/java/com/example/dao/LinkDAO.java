package com.example.dao;

import java.util.HashMap;
import java.util.List;

import com.example.domain.LinkVO;

public interface LinkDAO {
	public List<HashMap<String, Object>> listAll(String user);
	public List<HashMap<String, Object>> listFlt(LinkVO vo);
	public HashMap<String, Object> read(int linkId);
	public void insert(LinkVO vo);
	public void update(LinkVO vo);
	public void delete(int linkId);
}
