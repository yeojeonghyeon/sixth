package com.edu.scci.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.edu.scci.vo.BookVO;

@Repository
public class OrderDAOImpl implements OrderDAO {

	@Inject
	private SqlSession sqlSession;

	@Override
	public List<BookVO> getAllBooks() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("com.edu.scci.order.getAllBooks");
	}
}
