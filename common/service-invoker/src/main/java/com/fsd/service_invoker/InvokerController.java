package com.fsd.service_invoker;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
public class InvokerController {
	
    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/invoker-teacher")
    public Map<String, Object> getTeacher() {
        return teacherService.getTeacher();
    }

}
