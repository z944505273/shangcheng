package com.guoxianbin.service;


import com.github.pagehelper.PageInfo;
import com.guoxianbin.entity.Sku;
import com.guoxianbin.entity.SkuVo;

/**
 * 
 * @ClassName: SkuService 
 * @Description: sku的管理
 * @author: 郭宪彬
 * @date: 2020年6月29日 下午7:40:37
 */
public interface SkuService {
	
	int add(Sku sku);
	int update(Sku sku);
	int delete(int[] ids);
	
	PageInfo<Sku> list(SkuVo skuvo);
	
	Sku getById(int id);
	

}
