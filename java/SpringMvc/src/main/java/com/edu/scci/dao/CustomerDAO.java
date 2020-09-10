package com.edu.scci.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.edu.scci.vo.CustomerVO;

public interface CustomerDAO {
	public List<CustomerVO> getAllCustomer();
	public Map<String, String> getOrderAmtByCustId(String custId);
}
