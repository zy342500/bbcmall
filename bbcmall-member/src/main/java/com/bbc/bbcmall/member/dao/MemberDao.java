package com.bbc.bbcmall.member.dao;

import com.bbc.bbcmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhenye
 * @email mrch442@gmail.com
 * @date 2020-05-14 18:31:06
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
