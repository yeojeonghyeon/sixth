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

import com.edu.scci.service.CustomerService;
import com.edu.scci.service.OrderService;
import com.edu.scci.vo.CustomerVO;

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
		model.addAttribute("customers", customers);
		return "registerOrder";
	}
}
