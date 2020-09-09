package com.edu.scci.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.edu.scci.vo.CustomerVO;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<CustomerVO> getAllCustomer() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("com.edu.scci.customer.getAllCustomers");
	}

}
