package com.guoxianbin.dao;

import java.util.List;

import com.guoxianbin.entity.Category;



public interface CategoryDao {

	int add(Category category);

	int update(Category category);

	int delete(int id);

	 List<Category>  list(int parentId);

}
