package com.example.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.productservice.model.products;
@RestController
public class productcontroller {
	@GetMapping("/products")
	public List<products> getproducts()
	{
		List<products> list=new ArrayList<>();
		list.add(new products(101,"Skin care"));
		list.add(new products(102,"hair care"));
		
		return list;
		
	}

}
