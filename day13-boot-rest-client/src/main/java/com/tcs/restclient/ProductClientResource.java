package com.tcs.restclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/clientport")
public class ProductClientResource {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("get")
	public Product getProduct() {

		Product prod = restTemplate.getForObject("http://localhost:9090/product/api.1.0/productid/1", Product.class);
		return prod;
	}

}
