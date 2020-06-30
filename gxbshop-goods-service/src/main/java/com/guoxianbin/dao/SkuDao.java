package com.guoxianbin.dao;

import java.util.List;


import org.apache.ibatis.annotations.Param;

import com.guoxianbin.entity.Sku;
import com.guoxianbin.entity.SkuVo;
import com.guoxianbin.entity.SpecOption;



/**
 * 
 * @ClassName: SkuDao 
 * @Description: sku 的curd
 * @author: 段文龙
 * @date: 2020年6月29日 下午7:41:20
 */
public interface SkuDao {

	int insert(Sku sku);
	int insertSpecOption(@Param("skuId")  int id, @Param("opt") SpecOption specOption);
	

	int delete(int[] ids);
	int deleteSpecOption(int ...id);

	int update(Sku sku);	

	Sku findById(int id);
	List<Sku> list(SkuVo skuvo);



	

}
