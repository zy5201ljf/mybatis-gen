package com.levmin.service;

import com.levmin.entity.TbStudent;
import com.levmin.request.TbStudentRequest;

import java.util.List;

public interface DemoService {
    List<TbStudent> getTbStudentByNameAndAddr(TbStudentRequest request);
}
