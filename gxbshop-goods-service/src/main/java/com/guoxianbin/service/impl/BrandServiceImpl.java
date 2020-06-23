package com.guoxianbin.service.impl;


import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;


import com.github.pagehelper.PageInfo;
import com.guoxianbin.dao.BrandDao;
import com.guoxianbin.entity.Brand;
import com.guoxianbin.service.BrandService;

@Service(interfaceClass = BrandService.class)
public class BrandServiceImpl implements BrandService {
	
	@Autowired
	BrandDao brandDao ;

	@Override
	public int add(Brand brand) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Brand brand) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int[] ids) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PageInfo<Brand> list(Brand brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Brand> list() {
		// TODO Auto-generated method stub
		 return brandDao.queryAll();
	}

	@Override
	public Brand getById(int id) {
		// TODO Auto-generated method stub
		return brandDao.findById(id);
	}

}
