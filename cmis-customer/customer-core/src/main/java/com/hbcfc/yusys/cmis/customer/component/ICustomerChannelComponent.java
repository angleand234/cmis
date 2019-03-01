package com.hbcfc.yusys.cmis.customer.component;

import java.util.List;

import com.hbcfc.yusys.cmis.customer.mapper.domain.User;
import com.hbcfc.yusys.cmis.customer.mapper.domain.UserRoleList;

public interface ICustomerChannelComponent {
	List<User> selectAll();
	User selectById(Long id);
	User selectByIdMap(Long id);
	User selectByIdMap2(Long id);
	User selectByIdMap3(Long id);
	UserRoleList selectByIdMap4(Long id);
}
