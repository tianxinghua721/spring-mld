package com.mld.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mld.manage.mapper.ItemMapper;
import com.mld.manage.pojo.Item;
import com.mld.manage.service.ItemService;

import vo.EasyUIResult;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemMapper itemMapper;
	@Override
	public List<Item> findItemAll() {
		// TODO Auto-generated method stub
		return itemMapper.findItemAll();
	}
	@Override
	public EasyUIResult findItemByPage(Integer page, Integer rows) {
		EasyUIResult result=new EasyUIResult();
		result.setTotal(itemMapper.getTotal());
		int begin=(page-1)*rows;
		int end=rows;
		List list=itemMapper.findItemByPage(begin, end);
		result.setRows(list);
		return result;
	}
	@Override
	public String findItemCatNameByCid(Integer num) {
		
		return itemMapper.findItemCatNameByCid(num);
	}

}
