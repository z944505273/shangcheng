package com.guoxianbin.service;


import com.github.pagehelper.PageInfo;
import com.guoxianbin.entity.Spu;
import com.guoxianbin.entity.SpuVo;

/**
 * 
 * @ClassName: SpuService 
 * @Description: spu的管理
 * @author: 郭宪彬
 * @date: 2020年6月29日 下午7:40:48
 */
public interface SpuService {
	
	int add(Spu spu);
	int update(Spu spu);
	int delete(int[] ids);
	
	PageInfo<Spu> list(SpuVo spuvo);
	
	Spu getById(int id);
	

}
