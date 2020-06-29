package com.heygirl.edu.maja;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
class ConnectDB{
	@Autowired
	SqlSession sqlSession;

	public List<Map<String, String>> retrieve() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("common.listBook", new HashMap<String,String>());
	}
}