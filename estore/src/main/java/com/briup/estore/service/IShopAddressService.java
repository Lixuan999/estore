package com.briup.estore.service;

import java.util.List;

import com.briup.estore.bean.ShopAddress;

public interface IShopAddressService {
	public List<ShopAddress> findAddressBycustId(int custId);
}
