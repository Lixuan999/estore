package com.briup.estore.dao;

import java.util.List;

import com.briup.estore.bean.ShopAddress;

public interface ShopAddressMapper {
	public List<ShopAddress> selectAddressByCustId(int custId);
	public List<ShopAddress> selectAddressById(int id);
}
