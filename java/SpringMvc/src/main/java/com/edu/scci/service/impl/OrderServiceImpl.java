package com.edu.scci.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.edu.scci.dao.OrderDAO;
import com.edu.scci.service.OrderService;
import com.edu.scci.vo.BookVO;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Inject
	private OrderDAO orderDao;

	@Override
	public List<BookVO> getAllBooks() {
		// TODO Auto-generated method stub
		return orderDao.getAllBooks();
	}
}
