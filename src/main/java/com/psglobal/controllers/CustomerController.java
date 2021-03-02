package com.psglobal.controllers;

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
    public String saveCustomerDetails(@RequestBody Customer customer) {
        customerRepository.save(customer);
        return "Customer Details Added";
    }
	
	@PostMapping("/customers/calculateInterest")
	public Customer calculateInterst(@RequestBody Customer customer) {
		InterestRate ir = interestRateRepository.getInterestRate(customer.getPrincipalAmount(), customer.getYears());
		long interestAmount = customer.getYears() * customer.getPrincipalAmount() * ir.getInterestRate() /100;
		long totalAmount = interestAmount + customer.getPrincipalAmount();
		Customer customer1 = new Customer();
		customer1.setName(customer.getName());
		customer1.setMailId(customer.getMailId());
		customer1.setInterestAmount(interestAmount);
		customer1.setTotalAmount(totalAmount);
		customer1.setPhoneNumber(customer.getPhoneNumber());
		return  customer1;
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
	
	
	
	//@RequestMapping(method=RequestMethod.PUT, value="/customers")
	//void addCustomer(@RequestBody Customer customer) {
      //  customerRepository.save(customer);
    //}
}
