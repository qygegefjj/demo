package com.yz.service.Impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yz.dao.GoodsTypeMapper;
import com.yz.entity.GoodsType;
import com.yz.entity.GoodsTypeExample;
import com.yz.service.IGoodsTypeService;

@Service
public class GoodsTypeServiceImpl implements IGoodsTypeService{

	@Autowired
	private GoodsTypeMapper goodsTypeMapper;

	public List<GoodsType> findAll(int page, int rows) {
		GoodsTypeExample example=new GoodsTypeExample();
		RowBounds rowBounds=new RowBounds((page-1)*rows,rows);
		List<GoodsType> list = goodsTypeMapper.selectByExampleWithRowbounds(example, rowBounds);
		return list;
	}
	
	
}
