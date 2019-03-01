package com.hbcfc.yusys.cmis.customer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hbcfc.yusys.cmis.customer.mapper.domain.User;
import com.hbcfc.yusys.cmis.customer.mapper.domain.UserRoleList;

@Mapper
public interface UserMapper {

	List<User> selectAll();
	User selectById(Long id);
	User selectByIdMap(Long id);
	User selectByIdMap2(Long id);
	User selectByIdMap3(Long id);
	UserRoleList selectByIdMap4(Long id);
}
