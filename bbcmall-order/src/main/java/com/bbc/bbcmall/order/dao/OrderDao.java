package com.bbc.bbcmall.order.dao;

import com.bbc.bbcmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhenye
 * @email mrch442@gmail.com
 * @date 2020-05-14 17:33:48
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
