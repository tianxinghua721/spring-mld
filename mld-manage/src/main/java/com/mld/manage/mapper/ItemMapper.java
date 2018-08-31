package com.mld.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mld.manage.pojo.Item;

public interface ItemMapper {
	public List<Item> findItemAll();
	public int getTotal();
	public List<Item> findItemByPage(@Param("begin")int begin,@Param("end")int end);
	public String findItemCatNameByCid(Integer num);
}
