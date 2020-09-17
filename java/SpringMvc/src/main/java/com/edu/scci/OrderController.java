package com.edu.scci;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.edu.scci.service.CustomerService;
import com.edu.scci.service.OrderService;
import com.edu.scci.vo.BookVO;
import com.edu.scci.vo.CustomerVO;
import com.edu.scci.vo.OrderVO;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	@Qualifier("customerServiceImpl")
	CustomerService customerService;
	
	@Resource
	OrderService orderService;
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@RequestMapping(value = "/registerOrder", method = RequestMethod.GET)
	public String registerOrder(Model model) {
		List<CustomerVO> customers = customerService.getAllCustomers();
		List<BookVO> books = orderService.getAllBooks();
		model.addAttribute("customers", customers);
		model.addAttribute("books", books);
		return "registerOrder";
	}
	
	@RequestMapping(value = "/registerOrder", method = RequestMethod.POST)
	public String registerOrder(OrderVO order, Model model) {
		orderService.addOrder(order, null);
		model.addAttribute("result", "success");
		return "registerOrder";
	}
}
