package com.edu.scci.service;

import java.util.List;
import java.util.Map;

import com.edu.scci.vo.CustomerVO;

public interface CustomerService {
	public List<CustomerVO> getAllCustomers();
	public Map<String, String> getOrderAmtByCustId(String custId);
}
