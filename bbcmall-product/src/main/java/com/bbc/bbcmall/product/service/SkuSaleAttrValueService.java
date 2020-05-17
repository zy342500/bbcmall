package com.bbc.bbcmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bbcmall.common.utils.PageUtils;
import com.bbc.bbcmall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author zhenye
 * @email mrch442@gmail.com
 * @date 2020-05-14 18:21:51
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

