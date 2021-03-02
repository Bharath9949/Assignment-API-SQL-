package com.psglobal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.psglobal.entities.Customer;
import com.psglobal.entities.InterestRate;
import com.psglobal.repositories.InterestRateRepository;

@RestController
public class InterestRateController {
	
	@Autowired
	private InterestRateRepository interestRateRepository;
	
	@PostMapping("/interestRate")
    public String addInterestRate(@RequestBody InterestRate interestRate) {
		interestRateRepository.save(interestRate);
        return "Interest Rate Details Added";
    }

}
