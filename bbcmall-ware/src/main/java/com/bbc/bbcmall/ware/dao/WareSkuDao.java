package com.bbc.bbcmall.ware.dao;

import com.bbc.bbcmall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author zhenye
 * @email mrch442@gmail.com
 * @date 2020-05-14 18:33:48
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
