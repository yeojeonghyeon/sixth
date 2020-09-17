package com.edu.scci.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.edu.scci.dao.OrderDAO;
import com.edu.scci.service.OrderService;
import com.edu.scci.vo.BookVO;
import com.edu.scci.vo.OrderDetVO;
import com.edu.scci.vo.OrderVO;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Inject
	private OrderDAO orderDao;

	@Override
	public List<BookVO> getAllBooks() {
		// TODO Auto-generated method stub
		return orderDao.getAllBooks();
	}

	@Override
	public void addOrder(OrderVO order, List<OrderDetVO> orderDets) {
		// TODO Auto-generated method stub
		String ordId = orderDao.getOrderId();
		order.setOrdId(ordId);
		orderDao.addOrder(order);
	}
}
