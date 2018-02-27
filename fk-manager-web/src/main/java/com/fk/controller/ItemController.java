package com.fk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fk.pojo.TbItem;
import com.fk.service.ItemService;

/**
 * 商品管理Controller
 * @author fk
 *
 */
@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem geTbItemById(@PathVariable Long itemId){
		TbItem tbItem= itemService.getItemById(itemId);
		return tbItem;//@ResponseBody使用jackson将对象解析成json返回
	}

}
