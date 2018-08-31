package com.mld.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mld.manage.mapper.ItemCatMapper;
import com.mld.manage.pojo.ItemCat;
import com.mld.manage.service.ItemCatService;
@Service
public class ItemCatServiceImpl implements ItemCatService {
	@Autowired
	private ItemCatMapper itemCatMapper;
	@Override
	public List<ItemCat> findItemCat(Long parentId) {
		/*// TODO Auto-generated method stub
		ItemCat itemCat=new ItemCat();
		itemCat.setParentId(parentId);
		itemCat.setStatus(1);
		return itemCatMapper.select(itemCat);*/
		return itemCatMapper.findItemCatById(parentId);
	}
}
