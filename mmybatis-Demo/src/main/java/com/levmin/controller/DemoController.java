package com.levmin.controller;

import com.levmin.entity.TbStudent;
import com.levmin.request.TbStudentRequest;
import com.levmin.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/domo")
public class DemoController {

    @Autowired
    public DemoService demoService;

    @PostMapping("/getList")
    public List<TbStudent> getList(@RequestBody TbStudentRequest request){
        return demoService.getTbStudentByNameAndAddr(request);
    }
}
