package com.yz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yz.entity.GoodsType;
import com.yz.service.IGoodsTypeService;
import com.yz.vo.FenyeVO;


@Controller
public class GoodsTypeController {
	
	@Autowired
	private IGoodsTypeService goodsTypeService;
	@Autowired
	private FenyeVO fenyeVO;
	
	@RequestMapping("toindex")
	public String toindex(){
		System.out.println("toindex方法");
		return "/goodsType/index";
	}
	
	@RequestMapping("GoodsType_List")
	@ResponseBody
	public List<GoodsType> GoodsType_List(
			@RequestParam(value="page",defaultValue="1")int page,
			@RequestParam(value="page",defaultValue="5")int rows){
		return goodsTypeService.findAll(page,rows);
		 
	}
}
