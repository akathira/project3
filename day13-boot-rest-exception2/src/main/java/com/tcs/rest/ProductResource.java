package com.tcs.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.rest.exceptions.InvalidValueException;

@RestController
public class ProductResource {

	@GetMapping
	public String message(String str) throws Exception {
		if(str ==  null)
			throw new NullPointerException("Value not provided");
		
		boolean isNumeric = str.chars().allMatch(x-> Character.isDigit(x));
		
		if(isNumeric)
			throw new InvalidValueException("Excepted String found Int");
		
		if(str.length() == 1)
			throw new Exception("Value must be provided with length>1");
				
		int n=Integer.parseInt(str);
		return "Hello " + str +n;
	}

}
