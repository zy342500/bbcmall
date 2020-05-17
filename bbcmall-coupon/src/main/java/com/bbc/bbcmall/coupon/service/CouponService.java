package com.bbc.bbcmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bbcmall.common.utils.PageUtils;
import com.bbc.bbcmall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author zhenye
 * @email mrch442@gmail.com
 * @date 2020-05-14 18:26:40
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

