package com.bbc.bbcmall.coupon.dao;

import com.bbc.bbcmall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author zhenye
 * @email mrch442@gmail.com
 * @date 2020-05-14 18:26:40
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}