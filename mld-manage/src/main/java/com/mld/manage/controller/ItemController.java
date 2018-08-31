package com.mld.manage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mld.manage.pojo.Item;
import com.mld.manage.pojo.ItemCat;
import com.mld.manage.service.ItemService;

import vo.EasyUIResult;

@Controller
@RequestMapping("/item/")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	//url:localhost:8091/item/findAll
	@RequestMapping("findAll")
	@ResponseBody
	public List<Item> findAll() {
		return itemService.findItemAll();
	}
	//GET http://localhost:8091/item/query?page=1&rows=20 404 (Not Found)
	@RequestMapping("query")
	@ResponseBody
	public EasyUIResult findItemByPage(@RequestParam(value="page")Integer page,Integer rows) {
		System.out.println(itemService.findItemByPage(page, rows));
		return itemService.findItemByPage(page, rows);
		
	}
	//POST http://localhost:8091/item/queryItemCatName
		/*@RequestMapping("queryItemCatName")
		public void findItemCatName(@RequestParam(value="itemCatId")Integer num,HttpServletResponse response) throws IOException {
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(itemService.findItemCatNameByCid(num));
			//return itemService.findItemCatNameByCid(num);
			
		}*/
		@RequestMapping(value="queryItemCatName",produces="text/html;charset=utf-8")
		@ResponseBody
		public String findItemCatName(@RequestParam(value="itemCatId")Integer num)  {
			return itemService.findItemCatNameByCid(num);
		}
}
