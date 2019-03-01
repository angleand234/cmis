package com.hbcfc.yusys.cmis.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbcfc.yusys.cmis.customer.component.ICustomerChannelComponent;
import com.hbcfc.yusys.cmis.customer.mapper.domain.User;

@Service
public class CustomerChannelServiceImpl implements ICustomerChannelService {
	
	@Autowired
	private ICustomerChannelComponent customerComponent;

	@Override
	public User selectByIdMap(Long id) {
		User user = customerComponent.selectByIdMap(Long.valueOf(id));
		
		return user;
	}

	@Override
	public User selectByIdMap2(Long id) {
		User user = customerComponent.selectByIdMap2(Long.valueOf(id));
		return user;
	}

	@Override
	public User selectByIdMap3(Long id) {
		User user = customerComponent.selectByIdMap3(Long.valueOf(id));
		return user;
	}

	
}
