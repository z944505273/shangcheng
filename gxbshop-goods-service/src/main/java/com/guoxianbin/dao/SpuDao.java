package com.guoxianbin.dao;

import java.util.List;

import com.guoxianbin.entity.Spu;
import com.guoxianbin.entity.SpuVo;




/**
 * 
 * @ClassName: SpuDao 
 * @Description: TODO
 * @author: 段文龙
 * @date: 2020年6月29日 下午7:41:28
 */
public interface SpuDao {

	int add(Spu spu);

	int update(Spu spu);

	int delete(int[] ids);

	List<Spu> list(SpuVo spuvo);

	Spu findById(int id);

}
