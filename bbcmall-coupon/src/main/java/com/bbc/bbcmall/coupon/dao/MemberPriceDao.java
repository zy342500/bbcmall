package com.bbc.bbcmall.coupon.dao;

import com.bbc.bbcmall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author zhenye
 * @email mrch442@gmail.com
 * @date 2020-05-14 18:26:40
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}