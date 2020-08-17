package com.briup.estore.dao;

import com.briup.estore.bean.Customer;

public interface CustomerMapper {
	public void insertCustomer(Customer customer);
	public Customer selectCustomerByName(String name);
}
