package com.briup.estore.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.estore.bean.Category;
import com.briup.estore.dao.CategoryMapper;
import com.briup.estore.service.ICategoryService;
import com.briup.estore.utils.MyBatisSqlSessionFactory;

public class CategoryServiceImpl implements ICategoryService{

	@Override
	public List<Category> findFirstwithSecondCategory() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		CategoryMapper mapper = session.getMapper(CategoryMapper.class);
		List<Category> FirstCategory = mapper.selectFirstCategory();
		return FirstCategory;
	}

}
