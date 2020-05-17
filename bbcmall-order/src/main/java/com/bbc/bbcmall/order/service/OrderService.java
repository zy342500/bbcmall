package com.bbc.bbcmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bbcmall.common.utils.PageUtils;
import com.bbc.bbcmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author zhenye
 * @email mrch442@gmail.com
 * @date 2020-05-14 17:33:48
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

