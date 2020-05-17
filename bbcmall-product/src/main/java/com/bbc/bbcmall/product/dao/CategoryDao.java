package com.bbc.bbcmall.product.dao;

import com.bbc.bbcmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhenye
 * @email mrch442@gmail.com
 * @date 2020-05-14 18:21:51
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
