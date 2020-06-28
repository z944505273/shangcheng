package com.guoxianbin.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.guoxianbin.entity.Brand;
import com.guoxianbin.service.BrandService;




public class TestBrand extends TestBase{
	
	@Autowired
	BrandService bs;
	
	@Test
	public void testGet() {
		
		Brand brand = bs.getById(2);
		System.out.println("brand is " + brand);
		
	}

}
