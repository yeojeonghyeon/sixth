package com.edu.scci.dao;

import java.util.List;

import com.edu.scci.vo.BookVO;
import com.edu.scci.vo.OrderVO;

public interface OrderDAO {
	public List<BookVO> getAllBooks();
	public String getOrderId();
	public int addOrder(OrderVO order);
}
