package com.guoxianbin.service;

import java.util.List;



import com.github.pagehelper.PageInfo;
import com.guoxianbin.entity.Brand;

/**
 * 
 * @ClassName: BrandService 
 * @Description: 品牌的管理
 * @author: 郭宪彬
 * @date: 2020年6月29日 下午7:40:18
 */
public interface BrandService {
	
	int add(Brand brand);
	int update(Brand brand);
	int delete(int[] ids);
	PageInfo<Brand> list(Brand brand);
	List<Brand> list();
	Brand getById(int id);
	
	

}
