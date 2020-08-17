package com.briup.estore.service.impl;

import org.apache.ibatis.session.SqlSession;

import com.briup.estore.bean.Customer;
import com.briup.estore.dao.CustomerMapper;
import com.briup.estore.service.ICustomerService;
import com.briup.estore.utils.MyBatisSqlSessionFactory;


public class CustomerServiceImpl implements ICustomerService{
	//用户名不能重复
	@Override
	public void register(Customer customer) throws Exception {
		//判断输入的用户名或密码是否为空
		if(customer.getName()==null || customer.getPassword()==null) {
			throw new Exception("用户名或密码不能为空，请输入");
		}
		//根据用户名查询es_customer 如果查询到说明用户名已经被占用
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		CustomerMapper mapper = session.getMapper(CustomerMapper.class);
		Customer cust = mapper.selectCustomerByName(customer.getName());
		if(cust!=null) {
			throw new Exception("该用户名已被占用，请重新输入");
		}else {
			mapper.insertCustomer(customer);
			session.commit();
		}
		
		
	}

	@Override
	public Customer login(String name, String password) throws Exception {
		if(name==null || password==null) {
			throw new Exception("用户名或密码为空");
		}
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		CustomerMapper mapper = session.getMapper(CustomerMapper.class);
		Customer customer = mapper.selectCustomerByName(name);
		if(customer==null) {
			throw new Exception("用户名不存在");
		}else {
			if(!customer.getPassword().equals(password)) {
				throw new Exception("密码错误");
			}
		}
		
		return customer;
	}

}
