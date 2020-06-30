package com.guoxianbin.service.impl;

import org.apache.dubbo.config.annotation.Service;

import org.springframework.beans.factory.annotation.Autowired;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guoxianbin.dao.SpuDao;
import com.guoxianbin.entity.Spu;
import com.guoxianbin.entity.SpuVo;
import com.guoxianbin.service.SpuService;

/**
 * 
 * @ClassName: SpuServiceImpl 
 * @Description: spu 的实现类
 * @author: 郭宪彬
 * @date: 2020年6月29日 下午7:42:06
 */
@Service(interfaceClass = SpuService.class)
public class SpuServiceImpl implements SpuService{

	@Autowired
	SpuDao spuDao;
	
	@Override
	public int add(Spu spu) {
		// TODO Auto-generated method stub
		return spuDao.add(spu);
	}

	@Override
	public int update(Spu spu) {
		// TODO Auto-generated method stub
		return spuDao.update(spu);
	}

	@Override
	public int delete(int[] ids) {
		// TODO Auto-generated method stub
		return spuDao.delete(ids);
	}

	@Override
	public PageInfo<Spu> list(SpuVo spuvo) {
		// TODO Auto-generated method stub
		PageHelper.startPage(spuvo.getPageNum(), spuvo.getPageSize());
		return new PageInfo<Spu>(spuDao.list(spuvo));
	}

	@Override
	public Spu getById(int id) {
		// TODO Auto-generated method stub
		return spuDao.findById(id);
	}

}
