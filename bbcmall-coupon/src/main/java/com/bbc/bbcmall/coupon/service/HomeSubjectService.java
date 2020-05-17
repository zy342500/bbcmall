package com.bbc.bbcmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bbcmall.common.utils.PageUtils;
import com.bbc.bbcmall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author zhenye
 * @email mrch442@gmail.com
 * @date 2020-05-14 18:26:40
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

