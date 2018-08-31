package com.mld.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mld.manage.pojo.ItemCat;
import com.mld.manage.service.ItemCatService;

@Controller
@RequestMapping("/item/cat/")
public class ItemCatController {
	@Autowired
	private ItemCatService itemCatService;
	@RequestMapping("list")
	@ResponseBody
	//http://localhost:8091/item/cat/list
	public List<ItemCat> findItemCat(@RequestParam(defaultValue="0",value="id")Long parentId){
		return itemCatService.findItemCat(parentId);
	}
	
}
