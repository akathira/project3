package com.tcs.mvc;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping
	public String login(Model map) {

		ArrayList<String> products = new ArrayList<>();
		products.add("Television");
		products.add("laptop");
		products.add("smartwatch");
		products.add("smartphone");
		products.add("smartgoggles");

		map.addAttribute("catalog", products);
		return "sucess";
	}

}
