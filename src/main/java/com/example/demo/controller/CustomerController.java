package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;

@RestController
public class CustomerController {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@RequestMapping("/customerInfo")
	// defines a cache for method's return value
	@Cacheable(value="customerInfo")
	public List<Customer> customerInformation() {
		logger.info("Customer information from cache");
		
		List<Customer> details = Arrays.asList(
				new Customer(454654, "Charlie Puth", "Current A/X", 4861.36),
				new Customer(74962, "Andrew Garfield", "Saving A/X", 484983)
				);
		
		return details;
		
	}

}
