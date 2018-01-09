package com.yz.service;

import java.util.List;

import com.yz.entity.GoodsType;

public interface IGoodsTypeService {

	List<GoodsType> findAll(int page, int rows);

}
