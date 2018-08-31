package com.mld.manage.service;

import java.util.List;

import com.mld.manage.pojo.Item;

import vo.EasyUIResult;

public interface ItemService {
	public List<Item> findItemAll();
	public EasyUIResult findItemByPage(Integer page,Integer rows);
	public String findItemCatNameByCid(Integer num);
}
