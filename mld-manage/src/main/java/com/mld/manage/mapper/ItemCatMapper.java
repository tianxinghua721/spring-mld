package com.mld.manage.mapper;

import java.util.List;

import com.mld.manage.pojo.ItemCat;
import com.mld.mld_common.mapper.SysMapper;

public interface ItemCatMapper extends SysMapper<ItemCat>{
	public List<ItemCat> findItemCatById(Long parentId);
}
