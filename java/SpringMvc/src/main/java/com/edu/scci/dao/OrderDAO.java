package com.edu.scci.dao;

import java.util.List;
import java.util.Map;

import com.edu.scci.vo.BookVO;
import com.edu.scci.vo.OrderDetVO;
import com.edu.scci.vo.OrderVO;

public interface OrderDAO {
	public List<BookVO> getAllBooks();
	public String getOrderId();
	public int addOrder(OrderVO order);
	public int addDetail(OrderDetVO details);
	public List<Map<String, String>> getOrderList(Map<String, String> param);
}
