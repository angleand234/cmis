package com.hbcfc.yusys.cmis.customer.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hbcfc.yusys.cmis.customer.api.domain.UserDto;

@Component
@FeignClient(name="cmis-customer",fallback=CustomerCmisHystrix.class)
public interface CustomerCmisApi {

	
	@GetMapping("/select_resultmap3")
	public UserDto select_resultmap3(@RequestParam String id);
	
	@GetMapping("/hello")
	public String test_apollo();
	
}
