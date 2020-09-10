package com.edu.scci.service.impl;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.edu.scci.dao.CustomerDAO;
import com.edu.scci.service.CustomerService;
import com.edu.scci.vo.CustomerVO;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Inject
	private CustomerDAO customerDao;
	
	@Override
	public List<CustomerVO> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomer();
	}

	@Override
	public Map<String, String> getOrderAmtByCustId(String custId) {
		// TODO Auto-generated method stub
		return customerDao.getOrderAmtByCustId(custId);
	}
}
