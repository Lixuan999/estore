package com.briup.estore.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.estore.bean.ShopAddress;
import com.briup.estore.dao.ShopAddressMapper;
import com.briup.estore.service.IShopAddressService;
import com.briup.estore.utils.MyBatisSqlSessionFactory;

public class ShopAddressServiceImpl implements IShopAddressService{

	@Override
	public List<ShopAddress> findAddressBycustId(int custId) {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		ShopAddressMapper mapper = session.getMapper(ShopAddressMapper.class);
		
		List<ShopAddress> addressList = mapper.selectAddressByCustId(custId);
		return addressList;
	}

}
