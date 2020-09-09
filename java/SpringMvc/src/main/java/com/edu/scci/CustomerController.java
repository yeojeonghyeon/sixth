package com.edu.scci;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
import com.edu.scci.vo.CustomerVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CustomerController {
	
	@Autowired
	@Qualifier("customerServiceImpl")
	CustomerService customerService;
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public String customers(Model model) {
		List<CustomerVO> customers = customerService.getAllCustomers();				
		model.addAttribute("customers", customers );
		return "customers";
	}
	
}
