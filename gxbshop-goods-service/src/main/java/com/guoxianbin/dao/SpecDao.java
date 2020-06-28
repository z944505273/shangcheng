package com.guoxianbin.dao;

import java.util.List;

import com.guoxianbin.entity.Spec;
import com.guoxianbin.entity.SpecOption;



public interface SpecDao {

	int addSpec(Spec spec);

	int delOptions(int ...ids);

	int delSpec(int[] ids);

	int update(Spec spec);

	int addOption(SpecOption specOption);

	List<Spec> list(Spec spec);

	Spec findById(int id);

}
