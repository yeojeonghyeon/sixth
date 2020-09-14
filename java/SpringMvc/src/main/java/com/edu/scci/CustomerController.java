package com.edu.scci;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edu.scci.service.CustomerService;
import com.edu.scci.vo.CustomerVO;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	@Qualifier("customerServiceImpl")
	CustomerService customerService;
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String customers(Model model) {
		List<CustomerVO> customers = customerService.getAllCustomers();				
		model.addAttribute("customers", customers );
		return "customers";
	}
	
	@RequestMapping(value = "/orderInfo/{custId}", method = RequestMethod.GET)
	public String getOrderAmtByCustId(@PathVariable("custId") String custId, Model model) {
		Map<String, String> orderInfoMap = customerService.getOrderAmtByCustId(custId);				
		model.addAttribute("result", orderInfoMap );
		return "customerOrderInfo";
	}
	
	@RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
	public String addCustomer(Model model) {
		return "addCustomer";
	}
	
	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute CustomerVO customer, Model model) {
		int affectedCount = customerService.addCustomer(customer);
		model.addAttribute("affectedCount", affectedCount);
		return "addCustomer";
	}
}
