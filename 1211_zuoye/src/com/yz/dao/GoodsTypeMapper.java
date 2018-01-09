package com.yz.dao;

import com.yz.entity.GoodsType;
import com.yz.entity.GoodsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsTypeMapper {
    int countByExample(GoodsTypeExample example);

    int deleteByExample(GoodsTypeExample example);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    List<GoodsType> selectByExampleWithRowbounds(GoodsTypeExample example, RowBounds rowBounds);

    List<GoodsType> selectByExample(GoodsTypeExample example);

    int updateByExampleSelective(@Param("record") GoodsType record, @Param("example") GoodsTypeExample example);

    int updateByExample(@Param("record") GoodsType record, @Param("example") GoodsTypeExample example);
}