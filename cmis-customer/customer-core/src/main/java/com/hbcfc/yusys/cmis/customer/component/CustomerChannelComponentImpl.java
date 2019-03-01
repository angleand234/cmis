package com.hbcfc.yusys.cmis.customer.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hbcfc.yusys.cmis.customer.mapper.UserMapper;
import com.hbcfc.yusys.cmis.customer.mapper.domain.User;
import com.hbcfc.yusys.cmis.customer.mapper.domain.UserRoleList;

@Component
public class CustomerChannelComponentImpl implements ICustomerChannelComponent{

	@Autowired
	private UserMapper userMapper;


	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User selectById(Long id) {
		User user = userMapper.selectById(Long.valueOf(id));
		return user;
	}

	@Override
	public User selectByIdMap(Long id) {
		User user = userMapper.selectByIdMap(Long.valueOf(id));
		return user;
	}

	@Override
	public User selectByIdMap2(Long id) {
		User user = userMapper.selectByIdMap2(Long.valueOf(id));
		return user;
	}

	@Override
	public User selectByIdMap3(Long id) {
		User user = userMapper.selectByIdMap3(Long.valueOf(id));
		return user;
	}

	@Override
	public UserRoleList selectByIdMap4(Long id) {
		UserRoleList user = userMapper.selectByIdMap4(Long.valueOf(id));
		return null;
	}
}
