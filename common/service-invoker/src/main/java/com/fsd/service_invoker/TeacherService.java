package com.fsd.service_invoker;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-provider")
public interface TeacherService {

	    @RequestMapping("/getTeacher")
	    Map<String, Object> getTeacher();
}
