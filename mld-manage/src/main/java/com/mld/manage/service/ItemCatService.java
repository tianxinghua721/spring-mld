package com.mld.manage.service;

import java.util.List;

import com.mld.manage.pojo.ItemCat;

public interface ItemCatService {
	List<ItemCat> findItemCat(Long parentId);
}
