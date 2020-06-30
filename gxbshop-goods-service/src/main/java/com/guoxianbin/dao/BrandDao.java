package com.guoxianbin.dao;

import java.util.List;

import com.guoxianbin.entity.Brand;




public interface BrandDao {

	List<Brand> queryAll();

	Brand findById(int id);

}
