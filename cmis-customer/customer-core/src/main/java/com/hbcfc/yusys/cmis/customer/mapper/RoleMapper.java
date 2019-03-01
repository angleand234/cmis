package com.hbcfc.yusys.cmis.customer.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.hbcfc.yusys.cmis.customer.mapper.domain.User;


@Mapper
public interface RoleMapper {

	User selectById(Long id);
}
