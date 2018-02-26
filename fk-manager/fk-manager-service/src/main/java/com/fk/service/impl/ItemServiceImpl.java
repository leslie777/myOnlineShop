package com.fk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fk.mapper.TbItemMapper;
import com.fk.pojo.TbItem;
import com.fk.service.ItemService;

/**
 * 商品管理Service
 * @author fk
 *
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;
	
	@Override
	public TbItem getItemById(long itemId) {
		TbItem tbItem= itemMapper.selectByPrimaryKey(itemId);
		return tbItem;
	}

}
