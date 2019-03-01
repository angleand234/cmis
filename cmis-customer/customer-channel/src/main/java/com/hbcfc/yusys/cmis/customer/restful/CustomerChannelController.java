package com.hbcfc.yusys.cmis.customer.restful;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hbcfc.yusys.cmis.customer.api.CustomerCmisApi;
import com.hbcfc.yusys.cmis.customer.api.domain.UserDto;
import com.hbcfc.yusys.cmis.customer.component.ICustomerChannelComponent;
import com.hbcfc.yusys.cmis.customer.mapper.domain.User;
import com.hbcfc.yusys.cmis.customer.mapper.domain.UserRoleList;
import com.hbcfc.yusys.cmis.customer.service.ICustomerChannelService;
import com.hbcfc.yusys.cmis.customer.service.TestJavaConfigBean;
import com.hbcfc.yusys.cmis.customer.service.domain.UserModel;

@RestController
public class CustomerChannelController implements CustomerCmisApi {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ICustomerChannelService userService;

	@Autowired
	private ICustomerChannelComponent customerComponent;
	
	@Autowired
	public TestJavaConfigBean testJavaConfigBean;

	public void selectAll() {
		customerComponent.selectAll();
	}

	@GetMapping("/select_resultmap")
	public User select_resultmap(@RequestParam String id) {
		User user = userService.selectByIdMap(Long.valueOf(id));
		return user;
	}

	@GetMapping("/select_resultmap2")
	public User select_resultmap2(@RequestParam String id) {
		User user = userService.selectByIdMap2(Long.valueOf(id));
		return user;
	}

	public UserDto select_resultmap3(@RequestParam String id) {
		User userData = select_resultmap_common(id);
		UserDto user = new UserDto();
		user.setEmail(userData.getEmail());
		user.setId(userData.getId());
		user.setUsername(userData.getUsername());
		return user;
	}
	

	@GetMapping("/select_resultmap4")
	public UserRoleList select_resultmap4(@RequestParam String id) {
		UserRoleList user = customerComponent.selectByIdMap4(Long.valueOf(id));
		return user;
	}
	
	@GetMapping("/select_resultmap5")
	public UserModel select_resultmap5(@RequestParam String id) {
		User userData = select_resultmap_common(id);
		UserModel user = new UserModel();
		
		return user;
	}
	
	public User select_resultmap_common(String id) {
		User user = userService.selectByIdMap3(Long.valueOf(id));
		return user;
	}

	@Override
	public String test_apollo() {
		logger.trace("日志输出 trace");
        logger.debug("日志输出 debug");
        logger.info("日志输出 info");
        logger.warn("日志输出 warn");
        logger.error("日志输出 error");
		String name = testJavaConfigBean.getName();
		int batch = testJavaConfigBean.getBatch();
		int timeout = testJavaConfigBean.getTimeout();
		return "name:" + name + ",batch:" + batch + ",timeout:" + timeout;
	}
}
