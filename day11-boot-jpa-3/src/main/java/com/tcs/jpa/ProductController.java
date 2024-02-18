package com.tcs.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
	
	@Autowired
	ProductRepository repo;
	
	@GetMapping("/allProducts")
	public String showAll(Model model) {
	    //model.addAttribute("products", repo.findAll());
	    return "product";
	}

}
