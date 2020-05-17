package com.bbc.bbcmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bbcmall.common.utils.PageUtils;
import com.bbc.bbcmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zhenye
 * @email mrch442@gmail.com
 * @date 2020-05-14 18:31:06
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

