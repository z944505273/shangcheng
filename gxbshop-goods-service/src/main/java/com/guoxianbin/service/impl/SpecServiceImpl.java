package com.guoxianbin.service.impl;

import java.util.List;


import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guoxianbin.dao.SpecDao;
import com.guoxianbin.entity.Spec;
import com.guoxianbin.entity.SpecOption;
import com.guoxianbin.service.SpecService;

/**
 * 
 * @ClassName: SpecServiceImpl 
 * @Description: 规格管理的实现类
 * @author: 段文龙
 * @date: 2020年6月29日 下午7:41:56
 */
@Service(interfaceClass = SpecService.class)
public class SpecServiceImpl  implements SpecService{
	
	@Autowired
	SpecDao specDao;
	

	@Override
	public int add(Spec spec) {
		// TODO Auto-generated method stub
		//添加主表
		int result = specDao.addSpec(spec);// 主键自动生成
		
		//插入子表
		List<SpecOption> options = spec.getOptions();
		for (SpecOption specOption : options) {
			//设置主键
			specOption.setSpecId(spec.getId());
			result+=specDao.addOption(specOption);
		}
		
		return result;
		
	}

	@Override
	public int delete(int[] ids) {
		// TODO Auto-generated method stub
		// 先删除子表
		int result = specDao.delOptions(ids);
		result+=specDao.delSpec(ids);
		
		return result;
	}

	@Override
	public int update(Spec spec) {
		// TODO Auto-generated method stub
		// 修改主表
		int result = specDao.update(spec);
		//删除子表
		specDao.delOptions(spec.getId());
		
		//重新插入子表
		List<SpecOption> options = spec.getOptions();
		for (SpecOption specOption : options) {
			//设置主键
			specOption.setSpecId(spec.getId());
			result+=specDao.addOption(specOption);
		}
		
		return result;
	}

	@Override
	public PageInfo<Spec> list(int pageNum, int pageSize, Spec spec) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Spec>(specDao.list(spec));
	}

	@Override
	public Spec getById(int id) {
		// TODO Auto-generated method stub
		return specDao.findById(id);
	}

	@Override
	public List<Spec> listAll() {
		// TODO Auto-generated method stub
		return specDao.listAll();
	}

}
