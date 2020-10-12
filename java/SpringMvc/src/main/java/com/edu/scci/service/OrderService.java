package com.edu.scci.service;

import java.util.List;
import java.util.Map;

import com.edu.scci.vo.BookVO;
import com.edu.scci.vo.OrderDetVO;
import com.edu.scci.vo.OrderVO;

public interface OrderService {
	public List<BookVO> getAllBooks();
	public void addOrder(OrderVO order, List<OrderDetVO> orderDets);
	public List<Map<String, String>> getOrderList(Map<String, String> param);
}
