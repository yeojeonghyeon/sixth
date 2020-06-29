package com.scci.edu.db;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class ConnectDB {
	@Autowired
	@Qualifier("sqlSession")
	private SqlSession sqlSession;
	
	public List<Map<String, String>> selectBooks(Map<String, String> param){
		return sqlSession.selectList("common.listBook", param);
	}
}
