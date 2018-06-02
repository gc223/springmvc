package com.itheima.springmvc.service.impl;

import com.itheima.springmvc.mapper.ItemsMapper;
import com.itheima.springmvc.po.Items;
import com.itheima.springmvc.po.ItemsExample;
import com.itheima.springmvc.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemsMapper itemsMapper;

    public List<Items> getItemList() {
        return itemsMapper.selectByExampleWithBLOBs(new ItemsExample());
    }
}
