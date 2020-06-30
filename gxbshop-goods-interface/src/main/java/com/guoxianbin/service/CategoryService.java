package com.guoxianbin.service;

import java.util.List;

import com.guoxianbin.entity.Category;



/**
 * 
 * @ClassName: CategoryService 
 * @Description: 分类的管理
 * @author: 郭宪彬
 * @date: 2020年6月29日 下午7:40:27
 */
public interface CategoryService {
	
	public int add(Category category);
	
	public int udpate(Category category);
	
	public int del(int id);
	
	public List<Category> list(int parentId);
	
	

}
