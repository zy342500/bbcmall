package com.bbc.bbcmall.order.dao;

import com.bbc.bbcmall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author zhenye
 * @email mrch442@gmail.com
 * @date 2020-05-14 17:33:48
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
