package com.edu.scci.dao;

import java.util.List;
import java.util.Map;

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
		return sqlSession.selectList("com.edu.scci.customer.getAllCustomers");
	}

	@Override
	public Map<String, String> getOrderAmtByCustId(String custId) {
		return sqlSession.selectOne("com.edu.scci.customer.getOrderAmtByCustId", custId);
	}

	@Override
	public int addCustomer(CustomerVO customer) {
		return sqlSession.insert("com.edu.scci.customer.addCustomer", customer);
	}

}
