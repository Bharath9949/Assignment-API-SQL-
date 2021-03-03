package com.psglobal.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.psglobal.entities.Customer;
import com.psglobal.entities.InterestRate;
import com.psglobal.repositories.CustomerRepository;
import com.psglobal.repositories.InterestRateRepository;

@RestController
@CrossOrigin(origins="*")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private InterestRateRepository interestRateRepository;
	
	@PostMapping("/customers")
    public String saveCustomerDetails(@Valid @RequestBody Customer customer) {
        customerRepository.save(customer);
        return "Customer Details Added";
    }
	
	
	@GetMapping("/customers/calculateInterest")
	public Customer calculateInterst(@RequestParam("principalAmount") long principalAmount,  @RequestParam("years") int years) {
		InterestRate ir = interestRateRepository.getInterestRate(principalAmount, years);
		long interestAmount = years * principalAmount * ir.getInterestRate() /100;
		long totalAmount = interestAmount + principalAmount;
		Customer customer1 = new Customer();
		customer1.setInterestAmount(interestAmount);
		customer1.setTotalAmount(totalAmount);
		return  customer1;
	}
	

}
