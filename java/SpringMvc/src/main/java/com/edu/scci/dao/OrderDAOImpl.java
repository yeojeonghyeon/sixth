package com.edu.scci.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.edu.scci.vo.BookVO;
import com.edu.scci.vo.OrderDetVO;
import com.edu.scci.vo.OrderVO;

@Repository
public class OrderDAOImpl implements OrderDAO {

	@Inject
	private SqlSession sqlSession;

	@Override
	public List<BookVO> getAllBooks() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("com.edu.scci.order.getAllBooks");
	}

	@Override
	public int addOrder(OrderVO order) {
		// TODO Auto-generated method stub
		return sqlSession.insert("com.edu.scci.order.addOrder", order);
	}

	@Override
	public String getOrderId() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("com.edu.scci.order.getOrdId");
	}

	@Override
	public int addDetail(OrderDetVO details) {
		// TODO Auto-generated method stub
		return sqlSession.insert("com.edu.scci.order.addDetails", details);
	}

	@Override
	public List<Map<String, String>> getOrderList(Map<String, String> param) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("com.edu.scci.order.getOrderList", param);
	}
}
